package com.al.josev.lockteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Estadistica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica);

        //se declara el boton
        Button boton11;
        boton11 =(Button)findViewById(R.id.button10);
        boton11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent p = new Intent(getApplicationContext(),Configuracion.class);
                p.putExtra("confi",false);
                startActivity(p);
            }
        });
}
}
