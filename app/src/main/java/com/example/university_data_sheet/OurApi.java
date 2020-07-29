package com.example.university_data_sheet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OurApi {


    @GET("55f27b27c44608b903dd")
    Call<List<OurDataSet>> getDataSet();

}
