package com.example.intentextras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends Activity implements OnClickListener {

    EditText etFName;
    Button btnSubmit1;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        etFName = (EditText) findViewById(R.id.etFName);
        btnSubmit1 = (Button) findViewById(R.id.btnSubmit1);
        btnSubmit1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, PassActivity.class);
        intent.putExtra("name",etFName.getText().toString());
        startActivity(intent);
    }
}


