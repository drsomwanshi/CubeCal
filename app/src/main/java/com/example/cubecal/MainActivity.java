package com.example.cubecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view) {

        EditText txt1=findViewById(R.id.txt1);
        EditText txt2=findViewById(R.id.txt2);

        String user=txt1.getText().toString();
        String pass=txt2.getText().toString();
        if(user.equals("cocsit") && pass.equals("1234"))
        {
            

        }
    }
}