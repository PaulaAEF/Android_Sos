package com.example.todasv;


import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;


public class MainActivity extends AppCompatActivity {
Button iniciar ;
EditText cc , pass;
private RequestQueue queue ;

AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar = (Button)findViewById(R.id.botonlogin);
        cc =(EditText) findViewById(R.id.cc);
        pass=(EditText) findViewById(R.id.clavelogin);
        builder= new AlertDialog.Builder(MainActivity.this);


    }

    public void pasarRegistroPDSyCli(View view){
        Intent pasaregis = new Intent(this, Regis_PDS_Cliente.class);
        startActivity(pasaregis);
    }


    public void pasarTipoArr(View view){

        String tL= cc.getText().toString();
        String tP= pass.getText().toString();

        try {


            if (tL.matches("") || tP.matches("")) {

                Toast.makeText(getApplicationContext(), "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();

            } else {

                Intent pasaregis = new Intent(this, tipo_de_arreglo.class);


                startActivity(pasaregis);
            }
        }catch (Exception e){

        }
    }


}
