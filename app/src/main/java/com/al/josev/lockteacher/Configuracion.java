package com.al.josev.lockteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class Configuracion extends AppCompatActivity {
    Spinner day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if(extras.getBoolean("confi"))
        {
            File file = new File(getFilesDir(), "configuracion.txt");
            if (file.exists()) {
                Intent k = new Intent(this, Estadistica.class);
                startActivity(k);
            }
        }
        Button boton3=(Button)findViewById(R.id.button4);
        boton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CheckBox che=(CheckBox)findViewById(R.id.check1);
                Boolean valor=che.isChecked();

                Toast.makeText(getApplicationContext(),"Datos"+valor,Toast.LENGTH_LONG).show();

                String filename="user.txt";
                File file = new File(getFilesDir(), filename);
                String string = valor+",#";//codigo
                FileOutputStream outputStream;

                try {
                    outputStream = openFileOutput(filename,MODE_PRIVATE);
                    outputStream.write(string.getBytes());
                    outputStream.close();
                    Intent t = new Intent(getApplicationContext(),Estadistica.class);
                    startActivity(t);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

                Intent o = new Intent(getApplicationContext(),Estadistica.class);
                startActivity(o);

            }
        });

    }
}
