package com.example.carlyandlil;

import static com.example.carlyandlil.R.id.my_button12;

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

        ImageButton btn502 = findViewById(R.id.my_button12);
        btn502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Lets see your new pic",Toast.LENGTH_LONG).show();
                Intent homepage4 = new Intent(view.getContext(), Activity4.class);
                startActivity(homepage4);
            }
        });

    }

}


