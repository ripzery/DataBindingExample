package com.ripzery.databind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.ripzery.databind.BR;

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
        notifyPropertyChanged(BR.image);
    }

    public void setYear(String year) {
        this.year = year;
        notifyPropertyChanged(BR.year);
    }

    public void setProduct(String product) {
        this.product = product;
        notifyPropertyChanged(BR.product);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @BindingAdapter({"android:src"})
    public static void setImageUrl(ImageView view, String url){
        Picasso.with(view.getContext())
            .load(url)
            .centerCrop()
            .resize(250, 250)
            .into(view);
    }
}
