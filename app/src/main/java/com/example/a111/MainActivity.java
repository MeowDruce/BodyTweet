package com.example.a111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {

    Button btnActCreate;
    Button btnActShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActCreate = (Button) findViewById(R.id.btnActCreate);
        btnActCreate.setOnClickListener(this);

        btnActShow = (Button) findViewById(R.id.btnActShow);
        btnActShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnActCreate:
                intent = new Intent(this, ActivityCreate.class);
                startActivity(intent);
                break;
            case R.id.btnActShow:
                intent = new Intent(this, ActivityShow.class);
                startActivity(intent);
                break;
        }

    }
}
