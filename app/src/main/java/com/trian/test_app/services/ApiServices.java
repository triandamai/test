package com.trian.test_app.services;
/**
 * Service Class
 *
 * @author Cexup
 * @create by Trian Damai
 */

import androidx.annotation.NonNull;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;
import com.trian.test_app.MyApp;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Response;


public class ApiServices {
    /***
     * end point url
     * every request should use this var
     */
    public final static String BASE_URL = "https://rsgk.cexup.com";


    /**
     * ok http lib
     * because all result request return as Response
     *
     * @see Response
     * @see OkHttpClient
     */
    private OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
    /**
     * initiate this
     */
    private static ApiServices apiServices;

    public ApiServices() {
        AndroidNetworking.initialize(MyApp.getContext(), okHttpClient);
    }

    public static ApiServices getInstance() {
        if (apiServices == null) {
            apiServices = new ApiServices();
        }
        return apiServices;
    }




    /**
     * @param path            url to service
     * @param body            the data for passing to service

     * @see Response
     */
    public void post(@NonNull String path, @NonNull JSONObject body, String TAG) {
//        Vlog(body.toString());
        AndroidNetworking
                .post(BASE_URL + path)
                .addJSONObjectBody(body)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                             }

                    @Override
                    public void onError(ANError anError) {
                        }
                });
    }

    /**
     * @param path            url to service

     * @see Response
     */
    public void get(@NonNull String path,  String TAG) {
        AndroidNetworking
                .get(BASE_URL + path)
                .addHeaders("Authorization", "Bearer " )
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                          }

                    @Override
                    public void onError(ANError anError) {
     }
                });

    }

    /**
     * @param path            url to service

     * @see Response
     */
    public void put(@NonNull String path, @NonNull String body,String TAG) {
        AndroidNetworking
                .put(path)
                .addBodyParameter(body)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                    }

                    @Override
                    public void onError(ANError anError) {
                    }
                });
    }




}
