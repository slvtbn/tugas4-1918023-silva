package com.example.tugasprakitkum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[], s2[];
    int images[] = {R.drawable.hometown,R.drawable.deviljudge,R.drawable.hospital,R.drawable.melting,
            R.drawable.roomate,R.drawable.squidgame,R.drawable.startup};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Drakor);
        s2 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recylerView.setAdapter(myAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}