package com.example.crimebit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.crimebit.VICTIM.VictimLogin;

public class MainActivity extends AppCompatActivity {

    private Button victim;
    private Button police;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        victim=(Button)findViewById(R.id.buttonVictim);
        police=(Button)findViewById(R.id.button_Police);


        victim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, VictimLogin.class);

                startActivity(i);
            }
        });

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,VictimLogin.class);

                startActivity(i);
            }
        });

    }


}
