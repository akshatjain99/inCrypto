package com.example.android.incrypto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Rishi Banerjee on 08-11-2017.
 */

public class EthereumInformation extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price_index_eth);

        Button ethereumButton = (Button) findViewById(R.id.ethereum_button);
        ethereumButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                EditText getEthereumInitial = (EditText) findViewById(R.id.ethereum_initial_amount);
                int amount = Integer.parseInt(getEthereumInitial.getText().toString());
                int currentPrice = 350;
                int profit = currentPrice-amount;
                //double profitPercentage = profit/amount;

                TextView ethererumProfit = (TextView) findViewById(R.id.ethereum_profit);
                ethererumProfit.setText("Profit : "+profit);
            }
        });

    }
}
