package com.example.swappercheckeralito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.swappercheckeralito.SecondLayoutAlito;

public class MainActivity extends AppCompatActivity {
    EditText text1, text2;
    Button btn1, btn2;
    String string1,string2,string3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string1 = text1.getText().toString();
                string2 = text2.getText().toString();
                text1.setText(string2);
                text2.setText(string1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                if (text1 == text2){
                    string3 = "Same";
                }

                else {
                    string3 = "Not Same";
                }

                Intent intent = new Intent(MainActivity.this,SecondLayoutAlito.class);
                intent.putExtra("result", string3);
                startActivity(intent);
            }
        });
    }
}