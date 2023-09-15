package com.example.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
public class myapp extends Activity{
@Override
    protected  void onCreate(@Nullable Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.my_layot);
    final int[] text = {0,0};
    TextView textView1=findViewById(R.id.text1);
    Button button1 = findViewById(R.id.button1);
    TextView textView2=findViewById(R.id.text2);
    Button button2 = findViewById(R.id.button2);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            button1.setText("НАЖАТО!");
            text[0]++;
            textView1.setText((String.valueOf( text[0])));
        }
    });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            button2.setText("НАЖАТО!");
            text[1]++;
            textView2.setText((String.valueOf( text[1])));
        }
    });
}
}
