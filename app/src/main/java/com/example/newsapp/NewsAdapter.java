package com.example.newsapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter {

    ViewHolder viewHolder;

    NewsAdapter(Context context, List<News> data) {
        super(context, 0, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.news_item, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.mTitleTextView = convertView.findViewById(R.id.news_title);
            viewHolder.mSectionTextView = convertView.findViewById(R.id.news_section);
            viewHolder.mDateTextView = convertView.findViewById(R.id.news_date);
            viewHolder.mTimeTextView = convertView.findViewById(R.id.news_time);
            viewHolder.mAuthorTextView = convertView.findViewById(R.id.news_author);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        News currentNews = (News) getItem(position);

        String date = currentNews.getPublicationDate();
        SimpleDateFormat input = new SimpleDateFormat("yyyy-mm-dd'T'hh:mm:ss'Z'");
        Date d = null;
        try {
            d = input.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String formattedDate = formatDate(d);
        String formattedTime = formatTime(d);

        viewHolder.mTitleTextView.setText(currentNews.getTitle());
        viewHolder.mSectionTextView.setText(currentNews.getSection());
        viewHolder.mAuthorTextView.setText(currentNews.getAuthor());
        viewHolder.mDateTextView.setText(formattedDate);
        viewHolder.mTimeTextView.setText(formattedTime);

        return convertView;
    }

    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(date);
    }

    private String formatTime(Date date) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(date);
    }

    private class ViewHolder {
        TextView mTitleTextView;
        TextView mSectionTextView;
        TextView mDateTextView;
        TextView mTimeTextView;
        TextView mAuthorTextView;
    }
}
