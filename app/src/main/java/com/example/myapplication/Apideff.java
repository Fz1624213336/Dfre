package com.example.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 方小茗 on 2019/5/29.
 */

public interface Apideff {
    String url="https://gank.io/";
    @GET("api/data/福利/20/1")
    Observable<Shuju> getshu();
}
