package com.example.todasv;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Registro_Cliente extends AppCompatActivity {
Button  registrar;
EditText nombre, apellido,cc,fecha,tel,correo,pass;
    String server_URL="HTTP://ippp /archivo.php";
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__cliente);
        registrar = (Button)findViewById(R.id.Registro);
        nombre= (EditText)findViewById(R.id.nombre);
        apellido= (EditText)findViewById(R.id.apelliod);
        cc= (EditText)findViewById(R.id.cc);
        fecha= (EditText)findViewById(R.id.fecha);
        tel= (EditText)findViewById(R.id.tel) ;
        correo= (EditText)findViewById(R.id.correo);
        pass= (EditText)findViewById(R.id.pass);


    }

    public void pasarTipAr(View view){


        String t1= nombre.getText().toString();
        String t2= apellido.getText().toString();
        String t3= cc.getText().toString();
        String t4= fecha.getText().toString();
        String t5= tel.getText().toString();
        String t6= correo.getText().toString();
        String t7= pass.getText().toString();



        try {

            if (t1.matches("") || t2.matches("") || t3.matches("") || t4.matches("") || t5.matches("") || t6.matches("") || t7.matches("")) {
                Toast.makeText(getApplicationContext(), "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();


            }else{
                Intent pasarta = new Intent(this, tipo_de_arreglo.class);

                startActivity(pasarta);
                }
            }catch(Exception e){

            }

















        }




    }

