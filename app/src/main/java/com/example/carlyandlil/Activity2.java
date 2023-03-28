package com.example.carlyandlil;

import static com.example.carlyandlil.R.id.profileb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        ImageButton btnprofile = findViewById(profileb);
        btnprofile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Take me to my profile", Toast.LENGTH_LONG).show();
                Intent homepage5 = new Intent(view.getContext(), Activity4.class);
                startActivity(homepage5);
            }
        });

        ImageButton btn501 = findViewById(R.id.camerabutton);
        btn501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Yay!Lets add a new picture",Toast.LENGTH_LONG).show();
                Intent homepage3 = new Intent(view.getContext(), Activity5.class);
                startActivity(homepage3);
            }
        });
        ImageButton closetbtn = findViewById(R.id.closetbtn);
        closetbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Take me to my closet", Toast.LENGTH_LONG).show();
                Intent activity2 = new Intent(view.getContext(), Activity2.class);
                startActivity(activity2);
            }
        });

    }

}
