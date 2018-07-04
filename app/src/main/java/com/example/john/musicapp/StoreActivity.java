package com.example.john.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("SoulMate", "Justin Timberlake · $1.29"));
        songs.add(new Song("Don't Matter to Me (feat. Michael Jackson)", "Drake · $1.29"));
        songs.add(new Song("Connection", "Once Republic · $1.29"));
        songs.add(new Song("I Don't Knoe About You", "Chris Lane · $0.99"));
        songs.add(new Song("Bad Love (feat. Ellie Goulding)", "Sean Paul · $1.29"));

        //Display songs in Store
        SongAdapter adapter = new SongAdapter(this, songs); //new adapter
        ListView listView = (ListView) findViewById(R.id.list); //find view
        listView.setAdapter(adapter); //use adapter
    }
}
