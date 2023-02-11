package com.example.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox checkBox1,checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()){
                    Toast.makeText(MainActivity.this, "Tomato toppings added", Toast.LENGTH_SHORT).show();
                }else {

                }
                if(checkBox2.isChecked()){
                    Toast.makeText(MainActivity.this, "Cheese Toppings added", Toast.LENGTH_SHORT).show();
                }else{

                }
            }
        });

    }
}