package com.example.newsapp;

/**
 * This is the News post object that holds infomation about a News object
 */
class News {

    /**
     * This is the title of the news.
     */
    private String mTitle;

    /**
     * This is the section the news is located in.
     */
    private String mSection;

    /**
     * This is the publication date of the news
     */
    private String mPublicationDate;

    /**
     * This is the web url of the of the news
     */
    private String mWebUrl;

    /**
     * This is the name of the author
     */
    private String mAuthor;


    /**
     * This is the constructor for the {@link News} object
     * @param title is the title of the news
     * @param section is the category of the news
     * @param publicationDate is the date the news was published
     * @param author is the name of the author of the post
     * @param webUrl is the link to the post
     */
    News(String title, String section, String publicationDate, String author, String webUrl){
        this.mTitle = title;
        this.mSection = section;
        this.mPublicationDate = publicationDate;
        this.mAuthor = author;
        this.mWebUrl = webUrl;
    }

    /**
     * @return The title of the News
     */
    String getTitle() {
        return mTitle;
    }

    /**
     * @return The category of the News
     */
    String getSection() {
        return mSection;
    }

    /**
     * @return The publication date of the News post
     */
    String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * @return The link to the News post
     */
    String getWebUrl() {
        return mWebUrl;
    }

    /**
     * @return The name of the author of the news post
     */
    String getAuthor() {
        return mAuthor;
    }
}
