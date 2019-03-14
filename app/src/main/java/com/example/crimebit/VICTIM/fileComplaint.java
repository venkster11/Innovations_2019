package com.example.crimebit.VICTIM;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.crimebit.R;
import com.firebase.client.Firebase;

public class fileComplaint extends AppCompatActivity {
    private EditText mValueField;
    private Button mAddBtn;
    private Firebase mRootRef;
    private EditText mKeyValue;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_file_complaint);
        spinner=(Spinner)findViewById(R.id.Spinnerid);
        String[] stations={"Nerul","Thane","Mulund","Dadar","Bhandup","Belapur"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,stations);
        spinner.setAdapter(adapter);

        mRootRef=new Firebase("https://innovation2k19-43ff0.firebaseio.com/Users");
        mValueField=(EditText)findViewById(R.id.et2);
        mAddBtn=(Button)findViewById(R.id.bt);
        mKeyValue=(EditText)findViewById(R.id.et);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=mValueField.getText().toString();
                String key=mKeyValue.getText().toString();
                Firebase childRef=mRootRef.child(key);
                childRef.setValue(value);
            }
        });

    }

  /*  public void sendMessage(View view)
    {
        EditText editText=findViewById(R.id.Subject_edit);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, filedComplain.class);
        intent.putExtra("Extra_Message",message);
        startActivity(intent);
    }*/
}
