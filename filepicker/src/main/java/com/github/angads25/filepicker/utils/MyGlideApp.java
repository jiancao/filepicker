package com.github.angads25.filepicker.utils;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

/**
 * @author caojian
 * @date 2019/12/13 16:14
 **/
@GlideModule
public final class MyGlideApp extends AppGlideModule {
    public static AppGlideModule InjectedModule;

    @Override
    public void registerComponents(Context context, Glide glide, Registry registry) {
        if(InjectedModule != null) {
            InjectedModule.registerComponents(context, glide, registry);
        }
    }
}
