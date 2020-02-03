package com.gyasistory.myapplication.app.model_view;

import com.gyasistory.myapplication.app.model.AllGyasiPosts;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GyasiSiteAPICalls {

    @GET("posts")
    Observable<AllGyasiPosts> getAllPost();
}
