package com.example.android.bfframeadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.android.bfframeadmin.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //login button on the Admin Login page
    public void onClickLoginButton(View view){
        Intent intent = new Intent(this, OptionsInitialPage.class);
        startActivity(intent);
    }
}
