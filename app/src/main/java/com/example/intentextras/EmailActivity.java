package com.example.intentextras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends Activity implements OnClickListener {

    EditText etEmail;
    Button btnSubmit3;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        etEmail = (EditText) findViewById(R.id.etEmail);
        btnSubmit3 = (Button) findViewById(R.id.btnSubmit3);
        btnSubmit3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = getIntent();
        String Name = intent.getStringExtra("name");
        String Password = intent.getStringExtra("pass");
        Intent intent3 = new Intent(this, PhoneActivity.class);
        intent3.putExtra("name",Name);
        intent3.putExtra("pass", Password);
        intent3.putExtra("email",etEmail.getText().toString());
        startActivity(intent3);
    }
}
