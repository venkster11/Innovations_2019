package com.example.crimebit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Police_final_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_final_main);

    }

    public void comp_recived(View view) {
        Intent intent=new Intent(this,filedComplain.class);
        startActivity(intent);
    }
}
