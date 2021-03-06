package com.example.smrp;


import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("/userId")
    Call<response> getId(
            @Query("id") String id
    );

    @POST("/userRegister")
    Call<response> getUser(
            @Body User user
    );
    @POST("/medicineRegister")
    Call<response>addMedicine(
            @Body MedicineUserId medicineUserId
    );

    @GET("/medicineRegister")
    Call<List<reponse_medicine>>findUserMedicine(
            @Query("userId")String userId
    );

    @GET("/findId")
    Call<response> findId( //아이디 검색
            @Query("name") String id,
            @Query("email") String email
    );

    @GET("/findPassword")
    Call<response> findPassword( //패스워드 검색
            @Query("name") String name,
            @Query("id") String id,
            @Query("email") String email
    );

    @GET("/medicine1/find")
    Call<List<reponse_medicine>> findList( // 약 찾가
            @Query("shape") String shape,
            @Query("color") String color,
            @Query("formula") String formula,
            @Query("line") String line
    );

    @Multipart
    @POST("/medicine1/uploadImage")
    Call<String> uploadImage(@Part MultipartBody.Part files);


}
