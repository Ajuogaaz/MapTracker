package com.example.mapdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

class CustomWindowAdpater implements GoogleMap.InfoWindowAdapter {
    LayoutInflater mInflater;

    public CustomWindowAdpater(LayoutInflater mInflater) {
        this.mInflater = mInflater;
    }


    //This defines the contents within the info window based on the marker
    @Override
    public View getInfoWindow(Marker marker) {
        //Getting the view from the layout file
        View view = mInflater.inflate(R.layout.custom_info_window, null);

        //populate fields
        TextView title = view.findViewById(R.id.tv_info_window_title);
        title.setText(marker.getTitle());

        TextView description = view.findViewById(R.id.tv_info_window_description);
        description.setText(marker.getSnippet());

        //Return info window contents
        return view;


    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
