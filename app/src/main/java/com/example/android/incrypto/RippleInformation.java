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

public class RippleInformation extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price_index_ripple);

        Button rippleButton = (Button) findViewById(R.id.ripple_button);
        rippleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                EditText getRippleInitial = (EditText) findViewById(R.id.ripple_initial_amount);
                double amount = Double.parseDouble(getRippleInitial.getText().toString());
                double earlyPrice = 14.0d;
                double currentPrice = 13.6d;
                double ripplesBought = amount/earlyPrice;
                double profit = (ripplesBought*currentPrice)-amount;
                double profitPercentage = (profit/amount)*100.0d;

                TextView rippleProfit = (TextView) findViewById(R.id.ripple_profit);
                TextView rippleProfitPercentage = (TextView) findViewById(R.id.ripple_profit_percent);
                if(profit>0) {
                    rippleProfit.setText("Profit : " + profit);
                    rippleProfit.setTextColor(Color.GREEN);
                    rippleProfitPercentage.setText("Profit Percentage : " + profitPercentage);
                    rippleProfitPercentage.setTextColor(Color.GREEN);
                }
                else
                {
                    rippleProfit.setText("Profit : " + profit);
                    rippleProfit.setTextColor(Color.RED);
                    rippleProfitPercentage.setText("Profit Percentage : " + profitPercentage);
                    rippleProfitPercentage.setTextColor(Color.RED);
                }
            }
        });
    }
}
