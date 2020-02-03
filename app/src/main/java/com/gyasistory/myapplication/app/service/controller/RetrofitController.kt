package com.gyasistory.myapplication.app.service.controller

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.gyasistory.myapplication.app.BuildConfig
import com.gyasistory.myapplication.app.model.AllGyasiPosts
import com.gyasistory.myapplication.app.model.GlobalConstants
import com.gyasistory.myapplication.app.model_view.GyasiSiteAPICalls
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author Gyasi L. Story
 */
object RetrofitController {
    private const val TAG = "RetrofitController"
    fun getGSONRetrofitBuilder(url: String?): Retrofit {
        val builder = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        if (BuildConfig.DEBUG) {
            val client = OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .build()
            builder.client(client)
        }
        return builder.build()
    }

    @JvmStatic
    val wordPressPost: Observable<AllGyasiPosts?>
        get() {
            val retrofit =
                getGSONRetrofitBuilder(GlobalConstants.API_URL)
            val calls =
                retrofit.create(GyasiSiteAPICalls::class.java)
            return calls.allPost
        }
}