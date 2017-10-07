package com.example.admin.loginbythirdparties;

import android.app.Application;
import android.util.Log;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

/**
 * Created by ADMIN on 26-09-2017.
 */

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Twitter.initialize(this);
        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig("RcWbSvX3IGD76EUkwWruq7BTF", "JksDfcvRFYNQAnxCOTluJnHjoPf7JruSq3LgJRpfqR1Yy7hJzn"))
                .debug(true)
                .build();
        Twitter.initialize(config);

    }
}
