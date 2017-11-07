package com.example.android.incrypto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bitcoin_image = (ImageView) findViewById(R.id.bitcoin_image);
        bitcoin_image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                Intent intent = new Intent(MainActivity.this,PriceIndex.class);
                startActivity(intent);
            }
        });
    }
}
