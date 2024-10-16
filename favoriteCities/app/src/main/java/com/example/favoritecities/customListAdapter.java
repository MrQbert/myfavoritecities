package com.example.favoritecities;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class customListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] name;
    private final String[] nickname;
    private Integer[] imgid;


    public customListAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
