package com.example.carlyandlil;


import androidx.appcompat.app.AppCompatActivity;
import com.example.carlyandlil.Activity2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn10 = findViewById(R.id.my_button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button 1 clicked!",Toast.LENGTH_LONG).show();
            }
        });

        Button btn2 = findViewById(R.id.my_button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button 2 clicked!",Toast.LENGTH_LONG).show();
            }
        });

        Button btn = findViewById(R.id.my_button50);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Yay! You have signed in!",Toast.LENGTH_LONG).show();
                Intent homepage2 = new Intent(view.getContext(),Activity2.class);
                startActivity(homepage2);
            }
        });
    }
}


