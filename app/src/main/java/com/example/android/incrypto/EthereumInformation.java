package com.example.android.incrypto;

import android.graphics.Color;
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
                double amount = Double.parseDouble(getEthereumInitial.getText().toString());
                double earlyPrice = 480.0d;
                double currentPrice = 350.0d;
                double ethereumBought = amount/earlyPrice;
                double profit = (ethereumBought*currentPrice)-amount;
                double profitPercentage = (profit/amount)*100.0d;

                TextView ethereumProfit = (TextView) findViewById(R.id.ethereum_profit);
                TextView ethereumProfitPercentage = (TextView) findViewById(R.id.ethereum_profit_percentage);
                if(profit>0) {
                    ethereumProfit.setText("Profit : " + profit);
                    ethereumProfit.setTextColor(Color.GREEN);
                    ethereumProfitPercentage.setText("Profit Percentage : " + profitPercentage);
                    ethereumProfitPercentage.setTextColor(Color.GREEN);
                }
                else
                {
                    ethereumProfit.setText("Profit : " + profit);
                    ethereumProfit.setTextColor(Color.RED);
                    ethereumProfitPercentage.setText("Profit Percentage : " + profitPercentage);
                    ethereumProfitPercentage.setTextColor(Color.RED);
                }

            }
        });

    }
}
