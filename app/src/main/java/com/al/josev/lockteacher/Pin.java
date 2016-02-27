package com.al.josev.lockteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.al.josev.lockteacher.Clases.Lector;

import java.io.File;
import java.io.IOException;

public class Pin extends AppCompatActivity {
    String [] info;
    EditText nombre,pin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        nombre=(EditText)findViewById(R.id.input_nom2);
        pin1=(EditText)findViewById(R.id.pin_input);
        String filename="user.txt";
        File file = new File(getFilesDir(), filename);
        Lector log = new Lector();
        info= new String[2];
        info[0]="";
        info[1]="";
        try {
            info = log.leerLogin(file);
        }catch (IOException e)
        {

        }
        Button boton2=(Button)findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(info[0].compareToIgnoreCase(nombre.getText().toString()) != 0 && info[1].compareToIgnoreCase(pin1.getText().toString()) != 0)
                {
                    Intent t = new Intent(getApplicationContext(),Configuracion.class);
                    startActivity(t);
                } else {
                    Intent t = new Intent(getApplicationContext(),Preguntas.class);
                    startActivity(t);
                }

            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }

}
