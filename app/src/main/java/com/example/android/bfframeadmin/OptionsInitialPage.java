package com.example.android.bfframeadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.android.bfframeadmin.R.styleable.View;

public class OptionsInitialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_initial_page);
    }
    public void onClickAddAnimal(View view){
        Intent intent = new Intent(this, AddAnimal.class);
        startActivity(intent);
    }
}
