package com.example.android.bfframeadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class EditAnimalList extends AppCompatActivity {

    private ImageButton mImaButtonDelete;
    private TextView mNameOfAnimalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_animal_list);
        addListenerOnButton();
    }

    //button to delete an animal
    public void addListenerOnButton(){

        mImaButtonDelete = (ImageButton)findViewById(R.id.id_delete_animal);

        mImaButtonDelete.setOnClickListener(new View.OnClickListener() {
            //getting the name of the animal that's on the line of the deleting button, in order to show a toast that that animal was deleted
            @Override
            public void onClick(View view) {
                mNameOfAnimalTextView = (TextView)findViewById(R.id.animal_name_example) ;
                String animalName = mNameOfAnimalTextView.getText().toString();
                Toast.makeText(EditAnimalList.this, animalName + " was DELETED!", Toast.LENGTH_LONG).show();
            }
        });
    }

    //to logout and go to the login page
    public void onClickLogout(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
