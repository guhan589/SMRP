package com.example.smrp.hospital;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("/B551182/hospInfoService/getHospBasisList?ServiceKey=LjJVA0wW%2BvsEsLgyJaBLyTywryRMuelTIYxsWnQTaPpxdZjpuxVCdCtyNxvObDmBJ57VVaSi3%2FerYKQFQmKs8g%3D%3D&_type=json")//("/userInfo")
    Call<Return_tag> getList(@Query("yPos") double lat, @Query("xPos") double lng, @Query("radius") Integer m,@Query("dgsbjtCd") String dgsbjtCd);
}
