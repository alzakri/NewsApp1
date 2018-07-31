package com.example.android.newsapp1;


/**
 * Created by jvuonger on 9/29/16.
 */

public class NewsApp {

    /** Magnitude of the earthquake */
    private String mTitle;

    /** Location of the earthquake */
    private String mDate;

    /** Time of the earthquake */
    private String mAuthor;

    /** Website URL of the earthquake */
    private String mUrl;

    public NewsApp(String title, String date, String author, String url) {
        mTitle = title;
        mDate = date;
        mAuthor = author;
        mUrl = url;

    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}

