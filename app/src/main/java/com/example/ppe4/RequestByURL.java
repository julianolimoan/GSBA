package com.example.ppe4;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestByURL extends AsyncTask <String, Void, String> {

    @Override
    protected String doInBackground(String... urlParam) {
        try {
            URL url = new URL(urlParam[0]);
            Log.d("URL", urlParam[0]);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String result = bufferedReader.readLine();
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String result) {
        Log.d("Result", result);
    }

}