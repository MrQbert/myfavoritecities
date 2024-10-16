 package com.example.favoritecities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {

    ListView list;
    String name[] = {"Chicago", "Los Angeles", "New York", "San Fransisco"};
    String nickName[]= {"The Windy City", "the City of Angels", "The City That Never Sleeps", "The Golden City"};
    Integer imgid[]= {R.drawable.chicago, R.drawable.losangeles, R.drawable.newyork, R.drawable.sanfrancisco};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}