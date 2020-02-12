package com.firstweather.android.util;

import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callBack){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callBack);
    }

    public static void main(String[] args) {
        sendOkHttpRequest("http://guolin.tech/api/china", new Callback() {
            String level="province";
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(response.body().string());
            }

            @Override
            public void onFailure(Call call, IOException e) {

            }

        });
    }
}
