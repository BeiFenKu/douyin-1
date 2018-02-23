package com.b3ad.yuxie.myapplication.http;

import com.b3ad.yuxie.myapplication.http.interfaces.IHttpListener;
import com.b3ad.yuxie.myapplication.http.interfaces.IHttpService;

/**
 * Created by Administrator on 2017/09/11.
 */

public class RequestHolder<T> {

    private IHttpService mHttpService;
    private IHttpListener mHttpListener;
    private T mRequstInfo;
    private String mUrl;

    public IHttpService getmHttpService() {
        return mHttpService;
    }

    public void setmHttpService(IHttpService mHttpService) {
        this.mHttpService = mHttpService;
    }

    public IHttpListener getmHttpListener() {
        return mHttpListener;
    }

    public void setmHttpListener(IHttpListener mHttpListener) {
        this.mHttpListener = mHttpListener;
    }

    public T getmRequstInfo() {
        return mRequstInfo;
    }

    public void setmRequstInfo(T mRequstInfo) {
        this.mRequstInfo = mRequstInfo;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
