package com.example.includealltask.APIClasss;

import com.example.includealltask.Bean.APILoginBean;
import com.example.includealltask.Bean.OrderBean;
import com.example.includealltask.Bean.WishlistBean;
import com.example.includealltask.Bean.loginpassBean;
import com.example.includealltask.Common;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;



public interface APInterface {



    @GET("orders?userId=1")
    Call<OrderBean> getOrderResponce(@Header("Authorization")String authorization);

    @GET("wishlist?userId=1")
    Call<WishlistBean> getwishlistResponce(@Header("Authorization") String authorization);

    @POST("login")
    Call<APILoginBean> getloginResponce(@Body loginpassBean loginpassBean );

}
