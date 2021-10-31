package com.example.tugasprakitkum4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView judul, deskripsi;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        judul = findViewById(R.id.judul);
        deskripsi = findViewById(R.id.deskripsi);

        getData();
        setData();

    }

    private void getData(){
        if (getIntent().hasExtra("myImage")&& getIntent().hasExtra("data1")&&
                getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);

        }else{
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }
    }
    protected void setData(){
        judul.setText(data1);
        deskripsi.setText(data2);
        mainImageView.setImageResource(myImage);
    }

}