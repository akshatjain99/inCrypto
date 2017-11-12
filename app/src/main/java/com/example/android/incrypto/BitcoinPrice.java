package com.example.android.incrypto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.*;

/**
 * Created by Rishi Banerjee on 12-11-2017.
 */

public class BitcoinPrice {
    public double getPrice() throws IOException {
        String s = new String();
        double bitcoinPrice = 0.0d;
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setReadTimeout(5000);
        urlConnection.setConnectTimeout(7500);
        urlConnection.setRequestMethod("GET");
        urlConnection.connect();

        //if (urlConnection.getResponseCode() == 200) {
            inputStream = urlConnection.getInputStream();
            StringBuilder stringBuilder = new StringBuilder();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = bufferedReader.readLine();
            }
            s = stringBuilder.toString(); // We got it
            try {
                JSONObject reader = new JSONObject(s);
                JSONObject bpi = reader.getJSONObject("bpi");
                JSONObject usd = bpi.getJSONObject("USD");
                JSONObject price = usd.getJSONObject("rate");
                bitcoinPrice = Double.parseDouble(price.toString().replace(",", ""));

            } catch (Exception e) {
                e.printStackTrace();
            }


        //}
        return bitcoinPrice;
    }
}
