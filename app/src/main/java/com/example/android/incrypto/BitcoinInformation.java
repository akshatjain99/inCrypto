package com.example.android.incrypto;

import android.content.Intent;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Rishi Banerjee on 06-11-2017.
 */

public class BitcoinInformation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price_index_bitcoin);

        Button bitcoinButton = (Button) findViewById(R.id.bitcoin_button);
        bitcoinButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                EditText getBitcoinInitial = (EditText) findViewById(R.id.bitcoin_initial_amount);
                double amount = Double.parseDouble(getBitcoinInitial.getText().toString());
                double earlyPrice = 180000.0d;
                double currentPrice = 459970.6d;
                double bitcoinsBought = amount/earlyPrice;
                double profit = (bitcoinsBought*currentPrice)-amount;
                double profitPercentage = (profit/amount)*100.0d;

                TextView bitcoinProfit = (TextView) findViewById(R.id.bitcoin_profit);
                TextView bitcoinProfitPercentage = (TextView) findViewById(R.id.bitcoin_profit_percent);
                if(profit>0) {
                    bitcoinProfit.setText("Profit : " + profit);
                    bitcoinProfit.setTextColor(Color.GREEN);
                    bitcoinProfitPercentage.setText("Profit Percentage : " + profitPercentage);
                    bitcoinProfitPercentage.setTextColor(Color.GREEN);
                }
                else
                {
                    bitcoinProfit.setText("Profit : " + profit);
                    bitcoinProfit.setTextColor(Color.RED);
                    bitcoinProfitPercentage.setText("Profit Percentage : " + profitPercentage);
                    bitcoinProfitPercentage.setTextColor(Color.RED);
                }

            }
        });

    }
}
