package com.example.exampleimg_pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_register);

        textView=findViewById(R.id.textView);

        String NameEdtext=getIntent().getStringExtra("Message");

        textView.setText(NameEdtext);
    }
}