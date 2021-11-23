package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends Activity implements OnClickListener {

    EditText etPhone;
    Button btnSubmit4;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        etPhone = (EditText) findViewById(R.id.etPhone);
        btnSubmit4 = (Button) findViewById(R.id.btnSubmit4);
        btnSubmit4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = getIntent();
        String Name = intent.getStringExtra("name");
        String Password = intent.getStringExtra("pass");
        String Email = intent.getStringExtra("email");
        Intent intent4 = new Intent(this, ViewActivity.class);
        intent4.putExtra("name",Name);
        intent4.putExtra("pass",Password);
        intent4.putExtra("email",Email);
        intent4.putExtra("phone",etPhone.getText().toString());
        startActivity(intent4);
    }
}
