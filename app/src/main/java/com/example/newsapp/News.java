package com.example.newsapp;

public class News {

    private String mTitle;

    private String mSection;

    private String mPublicationDate;

    private String mWebUrl;

    private String mAuthor;


    News(String title, String section, String publicationDate, String author, String webUrl){
        this.mTitle = title;
        this.mSection = section;
        this.mPublicationDate = publicationDate;
        this.mAuthor = author;
        this.mWebUrl = webUrl;
    }

    String getTitle() {
        return mTitle;
    }

    String getSection() {
        return mSection;
    }

    String getPublicationDate() {
        return mPublicationDate;
    }

    String getWebUrl() {
        return mWebUrl;
    }

    String getAuthor() {
        return mAuthor;
    }
}
