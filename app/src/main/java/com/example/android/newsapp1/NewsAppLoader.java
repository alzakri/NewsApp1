package com.example.android.newsapp1;


import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;


public class NewsAppLoader extends AsyncTaskLoader<List<NewsApp>> {

    /** Tag for log messages */
    private static final String LOG_TAG = NewsAppLoader.class.getName();

    /** Query URL */
    private String mUrl;

    public NewsAppLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<NewsApp> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of newsApps.
        List<NewsApp> newsApps = com.example.android.newsapp1.QueryUtils.fetchEarthquakeData(mUrl);
        return newsApps;
    }
}

