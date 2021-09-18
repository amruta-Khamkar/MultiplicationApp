package com.example.multiplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                int num=Integer.parseInt(s);
                textView3.setText("Great ! Your Multiplication Table is ready");
                    textView.setText(num+" x "+ 1+ " = "+ num*1 +"\n"+num+" x "+ 2+ " = "+ num*2 +"\n" +num+" x "+ 3+ " = "+ num*3 +"\n"+
                            num+" x "+ 4+ " = "+ num*4 +"\n"+num+" x "+ 5+ " = "+ num*5 +"\n" +num+" x "+ 6+ " = "+ num*6 +"\n"+
                            num+" x "+ 7+ " = "+ num*7 +"\n"+num+" x "+ 8+ " = "+ num*8 +"\n"+num+" x "+ 9+ " = "+ num*9 +"\n"+
                            num+" x "+ 10+ " = "+ num*10 +"\n");

            }
        });
    }
}