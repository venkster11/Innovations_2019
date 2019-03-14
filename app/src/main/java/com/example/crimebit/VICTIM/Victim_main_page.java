package com.example.crimebit.VICTIM;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.crimebit.POLICE.Option;
import com.example.crimebit.R;

public class Victim_main_page extends AppCompatActivity {

    private Button fileComplaint;
    private Button filedComplaint;
    private Button complaintStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victim_main_page);
        fileComplaint=(Button)findViewById(R.id.buttonFileComplaint);
        filedComplaint=(Button)findViewById(R.id.buttonFiledComplaint);
        complaintStatus=(Button)findViewById(R.id.buttonComplaintStatus);

        fileComplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Victim_main_page.this, com.example.crimebit.VICTIM.fileComplaint.class);

                startActivity(i);
            }
        });

        filedComplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Victim_main_page.this, filedComplain.class);

                startActivity(i);
            }
        });

        complaintStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Victim_main_page.this, Option.class);

                startActivity(i);
            }
        });

    }


}
