package com.ripzery.databind;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import com.ripzery.databind.databinding.MainActivityBinder;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainActivityBinder mainActivityBinder = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User("Phuchit", "Oneplus2", "2027", "http://weknowyourdreams.com/images/dog/dog-07.jpg");
        mainActivityBinder.setUser(user);

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                user.setFirstName("Euro");
                user.setProduct("Motorola X pure");
                user.setYear("555");
                user.setImage("https://www.petfinder.com/wp-content/uploads/2012/11/140272627-grooming-needs-senior-cat-632x475.jpg");
            }
        }, 3000);

    }
}
