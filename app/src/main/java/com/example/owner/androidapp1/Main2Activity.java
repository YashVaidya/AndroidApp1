package com.example.owner.androidapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText userEditText;
    private EditText passEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        userEditText = findViewById(R.id.userEditText);
        passEditText = findViewById(R.id.passEditText2);
    }
    public void goBack(View view) {
        finish();
    }
    public void go3(View view) {
        String userNa = userEditText.getText().toString();
        String pass = passEditText.getText().toString();
        if(userNa.equals("user") && pass.equals("pass")) {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Username or password not valid", Toast.LENGTH_SHORT).show();
        }
    }
}
