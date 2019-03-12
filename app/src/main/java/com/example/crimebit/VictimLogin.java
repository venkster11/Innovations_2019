package com.example.crimebit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VictimLogin extends AppCompatActivity {
    private EditText name;
    private  EditText password;
    private Button login;

    private TextView attempts;
    private int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victim_login);

        name=(EditText)findViewById(R.id.editTextName);
        password=(EditText)findViewById(R.id.editTextPassword);
        login=(Button)findViewById(R.id.buttonLogin);

        attempts=(TextView)findViewById(R.id.textViewAttempts);
        attempts.setText("No Of Attempts Remaining : 5");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });

    }


    private void validate(String userName,String userPassword)
    {
        if((userName.equals("admin") && userPassword.equals("12345")))
        {
            Intent intent = new Intent(VictimLogin.this,Victim_main_page.class);
            //Intent is used to move from one activity to another
            startActivity(intent);
        }
        else if((userName.equals("admin") && userPassword.equals("admin")))
        {
            Intent intent = new Intent(VictimLogin.this,Police_final_main.class);
            //Intent is used to move from one activity to another
            startActivity(intent);
        }
        else
        {
            counter--;
            attempts.setText("No of Attempts Remaining: " + String.valueOf(counter));
            if(counter == 0)
            {
                login.setEnabled(false);
            }
        }
    }
}
