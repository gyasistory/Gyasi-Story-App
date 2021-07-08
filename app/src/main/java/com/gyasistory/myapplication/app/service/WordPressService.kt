package com.gyasistory.myapplication.app.service

import android.content.Context
import com.gyasistory.myapplication.app.features.wordpress.model.AllGyasiPosts
import com.gyasistory.myapplication.app.features.wordpress.db.RoomPostItem
import com.gyasistory.myapplication.app.features.wordpress.db.WordPressRepository
import com.gyasistory.myapplication.app.service.controller.RetrofitController.wordPressPost
import com.gyasistory.myapplication.app.service.controller.SharePreferenceController.getSyncDelayValue
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import java.util.*
import java.util.concurrent.TimeUnit

class WordPressService private constructor() {
    private val mAllGyasiPosts: Observable<AllGyasiPosts?>?
    private var mRepository: WordPressRepository? = null
    fun start(context: Context) {
        val delayTime = getSyncDelayValue(context.applicationContext)
        mRepository =
            WordPressRepository(
                context
            )
        Observable.interval(delayTime.toLong(), TimeUnit.MILLISECONDS, Schedulers.io())
            .flatMap { mAllGyasiPosts }
            .observeOn(Schedulers.io())
            .observeOn(Schedulers.io()).subscribe(mWordPressObserver)
    }

    private val mWordPressObserver: Observer<AllGyasiPosts?> =
        object : Observer<AllGyasiPosts?> {
            override fun onSubscribe(d: Disposable) {
                Timber.tag(TAG)
                    .d("onSubscribe() called with: d = [$d]")
            }

            override fun onNext(allGyasiPosts: AllGyasiPosts) {
                Timber.tag(TAG)
                    .d("onNext() called with: allGyasiPosts = [$allGyasiPosts]")
                Timber.tag(TAG).i(
                    "onNext: %s",
                    Objects.requireNonNull(allGyasiPosts.posts).toString()
                )
                for (post in allGyasiPosts.posts!!) {
                    mRepository!!.insertPostItem(
                        RoomPostItem(
                            post
                        )
                    )
                }
            }

            override fun onError(e: Throwable) {
                Timber.tag(TAG)
                    .d("onError() called with: e = [$e]")
            }

            override fun onComplete() {
                Timber.tag(TAG).d("onComplete() called")
            }
        }

    companion object {
        private const val TAG = "WordPressService"
        private var INSTANCE: WordPressService? = null
        val instance: WordPressService?
            get() {
                if (INSTANCE == null) {
                    INSTANCE = WordPressService()
                }
                return INSTANCE
            }
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    init {
        Timber.tag(TAG).d("WordPressService() called:")
        mAllGyasiPosts = wordPressPost
    }
}