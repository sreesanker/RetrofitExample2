package com.example.asus.retrofitexample2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.asus.retrofitexample2.R;
import com.example.asus.retrofitexample2.adapter.AdapterHomeAdapter;
import com.example.asus.retrofitexample2.apiclient.ApiClient;
import com.example.asus.retrofitexample2.apiclient.ApiInterface;
import com.example.asus.retrofitexample2.model.ModelHomeList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    private final static String API_KEY = "29185705be5354de5a0ad4565df49aa1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Key",API_KEY);

        if (API_KEY.isEmpty()){
            Toast.makeText(MainActivity.this,"Obtain your api key",Toast.LENGTH_SHORT).show();
            return;
        }

        final RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        try {
            ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

            Call<ModelHomeList> call = apiInterface.getHomeList(API_KEY);

            call.enqueue(new Callback<ModelHomeList>() {
                @Override
                public void onResponse(Call<ModelHomeList> call, Response<ModelHomeList> response) {
                    if(response.isSuccessful()){
                        if(response.body().isStatus()) {
                            List<ModelHomeList.DetailsBean.NearByVenuesBean> nearByVenuesBeans = (List<ModelHomeList.DetailsBean.NearByVenuesBean>) response.body().getDetails().getNearByVenues();
                            // 2. set layoutManger
                            recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                            recyclerView.setAdapter(new AdapterHomeAdapter(nearByVenuesBeans, R.layout.home_list, getApplicationContext()));
                        }
                    }else {
                        Toast.makeText(getApplicationContext(),"Unsuccesful response",Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ModelHomeList> call, Throwable t) {
                    Log.e(TAG, t.toString());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
