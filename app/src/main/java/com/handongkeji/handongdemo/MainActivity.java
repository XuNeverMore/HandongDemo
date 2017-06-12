package com.handongkeji.handongdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.handongkeji.handler.RemoteDataHandler;
import com.handongkeji.handongdemo.constants.URLConfig;
import com.handongkeji.modle.ResponseData;

public class MainActivity extends AppCompatActivity {

    String url = "servInfo/getServList.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getPackageList();
    }

    private static final String TAG = "MainActivity";

    private void getPackageList() {

        RemoteDataHandler.asyncPost(URLConfig.URL_SERVEICE_LIST, null, this, false, new RemoteDataHandler.Callback() {
            @Override
            public void dataLoaded(ResponseData data) {

                String json = data.getJson();
                Log.i(TAG, "dataLoaded: "+json);
            }
        });
    }
}
