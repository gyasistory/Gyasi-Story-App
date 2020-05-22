package com.gyasistory.myapplication.app.features.wordpress.api;

import com.gyasistory.myapplication.app.features.wordpress.model.AllGyasiPosts;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GyasiSiteAPICalls {

    @GET("posts")
    Observable<AllGyasiPosts> getAllPost();
}
