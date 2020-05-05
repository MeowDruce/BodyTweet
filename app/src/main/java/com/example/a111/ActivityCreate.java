package com.example.a111;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
public class ActivityCreate extends AppCompatActivity {
    private ImageView userImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        userImageView = findViewById(R.id.user_image_view);

        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(userImageView);
    }
}
