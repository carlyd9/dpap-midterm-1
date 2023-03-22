package com.example.carlyandlil;




import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.my_button);
        btn.setOnClickListener(view -> Toast.makeText(getApplicationContext(),"Button Clicked!",Toast.LENGTH_LONG).show());

        Button btn10 = findViewById(R.id.my_button10);
        btn10.setOnClickListener(view -> Toast.makeText(getApplicationContext(),"Button 10 Clicked!",Toast.LENGTH_LONG).show());

        Button btn2 = findViewById(R.id.my_button2);
        btn2.setOnClickListener(view -> Toast.makeText(getApplicationContext(),"Button 2 Clicked!",Toast.LENGTH_LONG).show());



    }
}


