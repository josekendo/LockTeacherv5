package com.al.josev.lockteacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;

public class Login_Activity extends AppCompatActivity {
    EditText nombre;
    EditText pin1;
    EditText pin2;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        File file = new File(getFilesDir(), "user.txt");
        if(file.exists())
        {
            //pasamos a un nuevo activity
        }
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
                //si es false se pasa a realizar el registro
                boolean error=false;
                //comprobamos los datos del nombre
                if(nombre.getText().length() == 0 || nombre.getText().toString().trim().length() == 0)
                {
                    error=true;
                }

                if(pin1.getText().toString().length() == 0 || pin2.getText().toString().length() == 0 || pin1.getText().toString().compareToIgnoreCase(pin2.getText().toString()) == 0)
                {
                    error=true;
                }

                if(pin1.getText().toString().length() <= 4)
                {
                    error=true;
                }

                if(pin2.getText().toString().length() <= 4)
                {
                    error=true;
                }

                if(error == false)
                {
                    String filename="user.txt";
                    File file = new File(getFilesDir(), filename);
                    String string = nombre.getText().toString()+",[@]"+pin1.getText().toString();
                    FileOutputStream outputStream;
                    try {
                        outputStream = openFileOutput(filename,MODE_PRIVATE);
                        outputStream.write(string.getBytes());
                        outputStream.close();
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                }
            }
        });
    }
}
