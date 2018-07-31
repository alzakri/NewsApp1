package com.example.android.newsapp1;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAppAdapter extends ArrayAdapter<NewsApp> {


    private static final String LOCATION_SEPARATOR = " of ";


    public NewsAppAdapter(Context context, List<NewsApp> newsAppList) {
        super(context, 0, newsAppList);

    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_app_list, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        NewsApp newsApp = getItem(position);

        String trimedDate = newsApp.getDate().substring(0, 10);

        TextView tvTitle = (TextView) listItemView.findViewById(R.id.primary_location);
        tvTitle.setText(newsApp.getTitle());

        TextView tvDate = (TextView) listItemView.findViewById(R.id.date);
        tvDate.setText(trimedDate);

        TextView tvType = (TextView) listItemView.findViewById(R.id.location_offset);
        tvType.setText(newsApp.getAuthor());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}

