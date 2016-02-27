package com.al.josev.lockteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.al.josev.lockteacher.Clases.Lector;

import java.io.File;
import java.io.IOException;

public class Pin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        EditText nombre=(EditText)findViewById(R.id.input_nom2);
        EditText pin1=(EditText)findViewById(R.id.pin_input);
        String filename="user.txt";
        File file = new File(getFilesDir(), filename);
        Lector log = new Lector();
        String [] info= new String[2];
        info[0]="";
        info[1]="";
        try {
            info = log.leerLogin(file);
        }catch (IOException e)
        {

        }
        if(info[0].compareToIgnoreCase(nombre.getText().toString()) == 0 && info[1].compareToIgnoreCase(pin1.getText().toString()) == 0)
        {
            Intent t = new Intent(this,Configuracion.class);
            startActivity(t);
        }
    }
}
