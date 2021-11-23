package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends Activity implements OnClickListener {


    TextView txtName1;
    TextView txtPass1;
    TextView txtEmail1;
    TextView txtPhone1;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        txtName1 = (TextView) findViewById(R.id.txtName);
        txtPass1 = (TextView) findViewById(R.id.txtPass);
        txtEmail1 = (TextView) findViewById(R.id.txtEmail);
        txtPhone1 = (TextView) findViewById(R.id.txtPhone);
        Intent intent = getIntent();
        String Name = intent.getStringExtra("name");
        String Password = intent.getStringExtra("pass");
        String Email = intent.getStringExtra("email");
        String Phone = intent.getStringExtra("phone");
        txtName1.setText("Имя: " + Name);
        txtPass1.setText("Пароль: " + Password);
        txtEmail1.setText("Почта: " + Email);
        txtPhone1.setText("Телефон: " + Phone);


    }


    @Override
    public void onClick(View v) {

    }
}
