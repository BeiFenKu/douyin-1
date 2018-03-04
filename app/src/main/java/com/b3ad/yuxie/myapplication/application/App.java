package com.b3ad.yuxie.myapplication.application;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import com.b3ad.yuxie.myapplication.utils.Utils;
import com.baselib.baseapp.BaseApplication;

import java.io.File;

/**
 * Created by Administrator on 2017/7/13.
 */

public class App extends BaseApplication {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

        //初始化工具类
//        Utils utils=new Utils(getApplicationContext());

        //配置okhttp3
//        initOkhttp3();
    }

    public static Context getContext() {
        return mContext;
    }

    /**
     * 初始化okhttp3,工具类配置
     */
    public void initOkhttp3() {
        String downloadFileDir = Environment.getExternalStorageDirectory().getPath() + "/okHttp_download/";
        String cacheDir = Environment.getExternalStorageDirectory().getPath();
        if (getExternalCacheDir() != null) {
            //缓存目录，APP卸载后会自动删除缓存数据
            cacheDir = getExternalCacheDir().getPath();
        }
//        OkHttpUtil.init(this)
//                .setConnectTimeout(15)//连接超时时间
//                .setWriteTimeout(15)//写超时时间
//                .setReadTimeout(15)//读超时时间
//                .setMaxCacheSize(10 * 1024 * 1024)//缓存空间大小
//                .setCacheType(CacheType.FORCE_NETWORK)//缓存类型
//                .setHttpLogTAG("HttpLog")//设置请求日志标识
//                .setIsGzip(false)//Gzip压缩，需要服务端支持
//                .setShowHttpLog(true)//显示请求日志
//                .setShowLifecycleLog(false)//显示Activity销毁日志
//                .setRetryOnConnectionFailure(false)//失败后不自动重连
//                .setCachedDir(new File(cacheDir, "okHttp_cache"))//缓存目录
//                .setDownloadFileDir(downloadFileDir)//文件下载保存目录
//                .setResponseEncoding(Encoding.UTF_8)//设置全局的服务器响应编码
//                .setRequestEncoding(Encoding.UTF_8)//设置全局的请求参数编码
////                .addResultInterceptor(HttpInterceptor.ResultInterceptor)//请求结果拦截器
////                .addExceptionInterceptor(HttpInterceptor.ExceptionInterceptor)//请求链路异常拦截器
//                .setCookieJar(new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(this)))//持久化cookie
//                .build();
    }

}
