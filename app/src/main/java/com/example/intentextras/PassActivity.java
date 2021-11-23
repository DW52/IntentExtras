package com.example.intentextras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PassActivity extends Activity implements OnClickListener {

    EditText etPass;
    Button btnSubmit2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        etPass = (EditText) findViewById(R.id.etPass);
        btnSubmit2 = (Button) findViewById(R.id.btnSubmit3);
        btnSubmit2.setOnClickListener(this);
        Intent intent = getIntent();
        String Name = intent.getStringExtra("name");

    }


    @Override
    public void onClick(View v) {
        Intent intent = getIntent();
        String Name = intent.getStringExtra("name");
        Intent intent2 = new Intent(this, EmailActivity.class);
        intent2.putExtra("name",Name);
        intent2.putExtra("pass",etPass.getText().toString());
        startActivity(intent2);
    }
}
