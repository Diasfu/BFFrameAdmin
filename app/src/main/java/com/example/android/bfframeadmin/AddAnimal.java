package com.example.android.bfframeadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.support.v7.appcompat.R.styleable.View;

public class AddAnimal extends AppCompatActivity {

    private EditText mNameOfAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);

        mNameOfAnimal = (EditText)findViewById(R.id.id_name_of_animal);
    }

    //toast
    public void onClickSaveButton(View view) {
        String animalName = mNameOfAnimal.getText().toString();
        Toast.makeText(this, animalName + " was stored!", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, OptionsInitialPage.class);
        startActivity(intent);
    }


}
