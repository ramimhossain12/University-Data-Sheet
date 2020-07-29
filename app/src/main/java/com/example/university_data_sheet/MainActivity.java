package com.example.university_data_sheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        OurApi ourApi = retrofit.create(OurApi.class);

        Call<List<OurDataSet>> listCall = ourApi.getDataSet();
        listCall.enqueue(new Callback<List<OurDataSet>>() {
            @Override
            public void onResponse(Call<List<OurDataSet>> call, Response<List<OurDataSet>> response) {


                ShowIt(response.body());
            }

            @Override
            public void onFailure(Call<List<OurDataSet>> call, Throwable t) {


            }
        });
    }

    private void ShowIt(List<OurDataSet> response) {

          DataAdapter dataAdapter = new DataAdapter(response,getApplicationContext());

          recyclerView.setAdapter(dataAdapter);

    }
}