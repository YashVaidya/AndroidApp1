package com.example.owner.androidapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Main4Activity extends AppCompatActivity {
    private EditText idEditText;
    private EditText passEditText;
    public static String userNa;
    public static String pass;
    private EditText userEditText;
    public static String actNa;
    public static String userType = "shamssoftware";
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        idEditText = findViewById(R.id.idEditText);
        passEditText = findViewById(R.id.passEditText);

    }
    public void go1(View view) {
        userNa = idEditText.getText().toString();
        pass = passEditText.getText().toString();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
    public void go11(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Log.i("Button pressed?", "YEEETTETTETETETTETE");

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton6:
                if (checked)
                    userType = "User";
                   // Log.i("Data: ", userType);}
                    break;
            case R.id.radioButton7:
                if (checked)
                    // Ninjas rule
                    userType = "Manager";
                   //Log.i("Data: ", userType);}

                    break;
            case R.id.radioButton8:
                if (checked)
                    // Ninjas rule
                    userType = "Location Employee";
                  // Log.i("Data: ", userType);}

                    break;
            case R.id.radioButton9:
                if (checked)
                    // Ninjas rule
                    userType = "Admin";
                   //Log.i("Data: ", userType);}
                    break;

        }
    }

}
