package com.example.todasv;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class describir_problema extends AppCompatActivity {
Button continuar;
EditText nombre,descripcion,fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describir_problema);
        continuar = (Button)findViewById(R.id.Registro);
        nombre= (EditText)findViewById(R.id.nombrepro);
        descripcion= (EditText)findViewById(R.id.descripcionproblema);
        fecha= (EditText)findViewById(R.id.fechapro);


    }

    public void pasarSeleccTrab(View view){

        String t1d = nombre.getText().toString();
        String t2d = descripcion.getText().toString();
        String t3d = fecha.getText().toString();


        try{
            if (t1d.matches("") || t2d.matches("") || t3d.matches("")){
                Toast.makeText(getApplicationContext(), "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();

            }else{
                Intent pasarst = new Intent(this, seleccionar_trabajador.class);
                startActivity(pasarst);
            }

        }catch (Exception e){

        }



    }


}
