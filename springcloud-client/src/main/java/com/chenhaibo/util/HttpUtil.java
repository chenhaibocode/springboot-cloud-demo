package com.chenhaibo.util;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HttpUtil {

    private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient.Builder().connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).build();

    public static String httpGet(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = OK_HTTP_CLIENT.newCall(request).execute();
        return response.body().string();
    }
}
