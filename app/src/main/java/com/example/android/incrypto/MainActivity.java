package com.example.android.incrypto;

import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.support.v4.app.LoaderManager;
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
                Intent intent = new Intent(MainActivity.this,BitcoinInformation.class);
                startActivity(intent);
            }
        });

        ImageView ethereum_image = (ImageView) findViewById(R.id.ethereum_image);
        ethereum_image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                Intent intent = new Intent(MainActivity.this,EthereumInformation.class);
                startActivity(intent);
            }
        });

        ImageView ripple_image = (ImageView) findViewById(R.id.ripple_image);
        ripple_image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                Intent intent = new Intent(MainActivity.this,RippleInformation.class);
                startActivity(intent);
            }
        });
    }
}
