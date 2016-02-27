package com.al.josev.lockteacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Pin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        EditText nombre=(EditText)findViewById(R.id.input_nom2);
        EditText pin1=(EditText)findViewById(R.id.pin_input);

    }
}
