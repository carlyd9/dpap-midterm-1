package com.example.carlyandlil;

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

        ImageButton btn501 = findViewById(R.id.camerabutton);
        btn501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Yay!Lets add a new picture",Toast.LENGTH_LONG).show();
                Intent homepage3 = new Intent(view.getContext(), Activity3.class);
                startActivity(homepage3);
            }
        });

    }

}
