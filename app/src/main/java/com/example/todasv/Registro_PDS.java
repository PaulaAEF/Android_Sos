package com.example.todasv;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Registro_PDS extends AppCompatActivity {
    Button registrar;
    EditText nombre, apellido,cc,fecha,tel,correo,pass,profesio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__pds);

        registrar = (Button)findViewById(R.id.Siguiente);
        nombre= (EditText)findViewById(R.id.nombre);
        apellido= (EditText)findViewById(R.id.apelliod);
        cc= (EditText)findViewById(R.id.cc);
        fecha= (EditText)findViewById(R.id.fecha);
        tel= (EditText)findViewById(R.id.tel) ;
        correo= (EditText)findViewById(R.id.correo);
        pass= (EditText)findViewById(R.id.pass);
        profesio=(EditText)findViewById(R.id.profe);

    }

    public void pasarOpciPDS(View view){

            Intent pasaropds = new Intent(this, opciones_PDS.class);

       //pasaropds.putExtra("Info",nombre.getText().toString());
       // pasaropds.putExtra("Info","paula");


        startActivity(pasaropds);

    }


}
