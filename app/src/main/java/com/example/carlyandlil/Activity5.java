package com.example.carlyandlil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5);


        Button btn5 = findViewById(R.id.my_button50);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Pic added",Toast.LENGTH_LONG).show();
                Intent homepage4 = new Intent(view.getContext(), Activity3.class);
                startActivity(homepage4);
            }
        });

    }

}
