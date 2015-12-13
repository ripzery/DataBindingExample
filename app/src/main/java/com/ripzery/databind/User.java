package com.ripzery.databind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by Euro on 12/11/15 AD.
 */
public class User extends BaseObservable{
    private static  String TAG = "User";
    private  String firstName;
    private  String product;
    private  String year;
    private  String image;

    public User(String firstName, String product, String year, String image) {
        this.firstName = firstName;
        this.product = product;
        this.year = year;
        this.image = image;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getYear() {
        return year;
    }

    @Bindable
    public String getProduct() {
        return product;
    }

    @Bindable
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        notifyPropertyChanged(com.ripzery.databind.BR.image);
    }

    public void setYear(String year) {
        this.year = year;
        notifyPropertyChanged(com.ripzery.databind.BR.year);
    }

    public void setProduct(String product) {
        this.product = product;
        notifyPropertyChanged(com.ripzery.databind.BR.product);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.ripzery.databind.BR.firstName);
    }

    @BindingAdapter({"app:roop","app:placeHolder"})
    public static void setImageUrl(ImageView view, String url, Drawable placeHolder){
        Picasso.with(view.getContext())
            .load(url)
            .placeholder(placeHolder)
            .centerCrop()
            .resize(250, 250)
            .into(view);
    }
}
