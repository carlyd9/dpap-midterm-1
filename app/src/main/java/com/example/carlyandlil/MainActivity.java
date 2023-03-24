package com.example.carlyandlil;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.my_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SigninActivity.class);
                view.getContext().startActivity(i);
            }
        });
        Button btn2 = findViewById(R.id.my_button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Clicked!",Toast.LENGTH_LONG).show();
            }
        });
        Button btn10 = findViewById(R.id.my_button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Clicked!",Toast.LENGTH_LONG).show();
            }
        });

    }
}


