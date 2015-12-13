package com.ripzery.databind;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingComponent;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by Euro on 12/11/15 AD.
 */
public class DataBindImage implements android.databinding.DataBindingComponent{
    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url){
        Picasso.with(view.getContext()).load(url).into(view);
    }
}
