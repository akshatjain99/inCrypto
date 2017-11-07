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
                int amount = Integer.parseInt(getRippleInitial.getText().toString());
                int currentPrice = 13;
                int profit = currentPrice-amount;
                //double profitPercentage = profit/amount;

                TextView rippleProfit = (TextView) findViewById(R.id.ripple_profit);
                rippleProfit.setText("Profit : "+profit);
            }
        });
    }
}
