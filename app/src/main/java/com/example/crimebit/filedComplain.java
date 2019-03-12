package com.example.crimebit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class filedComplain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filed_complain);


        Intent intent = getIntent();

        String message = intent.getStringExtra("Extra_Message");
        TextView textView = (findViewById(R.id.display_message));

        textView.setText(message);
    }


}
