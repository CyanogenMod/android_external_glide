package com.bumptech.glide.request;

import com.bumptech.glide.load.engine.Resource;

public interface ResourceCallback {

    public void onResourceReady(Resource resource);

    public void onException(Exception e);
}
