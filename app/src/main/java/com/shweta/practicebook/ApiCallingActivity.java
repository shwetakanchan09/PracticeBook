package com.shweta.practicebook;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiCallingActivity extends AppCompatActivity {

    RecyclerView rv;
    ApiCallingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_calling);

        rv = (RecyclerView) findViewById(R.id.rv);

        String gender = getIntent().getStringExtra("gender");
        String religion = getIntent().getStringExtra("religion");
        ApiCalling(Integer.parseInt(religion), Integer.parseInt(gender));



    }

    private void ApiCalling(int catId, int gender) {
        Call<ArrayList<GenderModel>> call = ApiClient.getTryCatchInterface().getData(catId, gender);
        call.enqueue(new Callback<ArrayList<GenderModel>>() {
            @Override
            public void onResponse(Call<ArrayList<GenderModel>> call, Response<ArrayList<GenderModel>> response) {

                if (response.code() == 200 && response.body() != null) {

                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                    rv.setLayoutManager(linearLayoutManager);
                    adapter = new ApiCallingAdapter(ApiCallingActivity.this, response.body());
                    rv.setAdapter(adapter);

                    Toast.makeText(ApiCallingActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<GenderModel>> call, Throwable t) {

                Toast.makeText(ApiCallingActivity.this, "onFailure", Toast.LENGTH_SHORT).show();
            }
        });
    }
}