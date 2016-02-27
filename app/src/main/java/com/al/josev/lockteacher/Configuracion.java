package com.al.josev.lockteacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Configuracion extends AppCompatActivity {
    Spinner day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        day = (Spinner)findViewById(R.id.spinne);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.asig, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        day.setAdapter(adapter);
        setContentView(R.layout.activity_configuracion);
    }
}
