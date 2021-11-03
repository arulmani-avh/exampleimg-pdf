package com.example.exampleimg_pdf;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText NameEdtext, Passwordedtext;
    Button ADD, SIGNUP;
    private final int request=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        NameEdtext = findViewById (R.id.nameedtext);
        Passwordedtext = findViewById (R.id.passedtext);
        ADD = findViewById (R.id.Addbtn);
        SIGNUP = findViewById (R.id.signupbtn);

       String NameEdtextstrng;
       // BreakIterator name = null;
       //   assert false;
        NameEdtextstrng = NameEdtext.getText ( ).toString ( );
        ADD.setOnClickListener (v -> {

            Intent intent = new Intent (MainActivity.this, RegisterActivity.class);
           intent.putExtra ("Message", NameEdtextstrng);
          //int request = 0;
            startActivityForResult (intent,request);

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult (requestCode, resultCode, data);

        if (requestCode==request)
        {
            if (resultCode==RESULT_OK)
            {
                assert data != null;
                String msg;
                msg = data.getStringExtra("Msg");
            }
        }
    }
}
