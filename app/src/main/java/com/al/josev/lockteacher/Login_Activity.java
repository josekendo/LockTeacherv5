package com.al.josev.lockteacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {
    EditText nombre;
    EditText pin1;
    EditText pin2;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);


        //se declara las variables del reegistro
        nombre=(EditText)findViewById(R.id.input_nom);
        pin1=(EditText)findViewById(R.id.input_pass);
        pin2=(EditText)findViewById(R.id.input_pass3);

        //se declara el boton
        boton=(Button)findViewById(R.id.seguir);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //comprobamos los datos del nombre
                if(nombre.getText().length() > 0)
                {

                }
            }
        });
    }
}
