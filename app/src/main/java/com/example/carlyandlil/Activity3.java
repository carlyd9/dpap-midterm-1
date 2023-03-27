package com.example.carlyandlil;

import static com.example.carlyandlil.R.id.camerabutton5;
import static com.example.carlyandlil.R.id.profileb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);


        ImageButton btn503 = findViewById(R.id.fowardbutton);
        btn503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Lets see your new pic", Toast.LENGTH_LONG).show();
                Intent homepage4 = new Intent(view.getContext(), Activity4.class);
                startActivity(homepage4);
            }
        });

        ImageButton btnprofile = findViewById(profileb);
        btnprofile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Take me to my profile", Toast.LENGTH_LONG).show();
                Intent homepage5 = new Intent(view.getContext(), Activity4.class);
                startActivity(homepage5);
            }
        });


        ImageButton btncamera = findViewById(camerabutton5);
        btncamera.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "retake pic", Toast.LENGTH_LONG).show();
                Intent homepage5 = new Intent(view.getContext(), Activity5.class);
                startActivity(homepage5);
            }
        });

    }
}



