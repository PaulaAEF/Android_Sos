package com.example.todasv;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;



public class Registro_PDS extends AppCompatActivity {
    Button registrarpd;
    EditText nombrepd, apellidopd,ccpd,fechapd,telpd,correopd,passpd,profesiopd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__pds);

        registrarpd = (Button)findViewById(R.id.Siguientep);
        nombrepd= (EditText)findViewById(R.id.nombrep);
        apellidopd= (EditText)findViewById(R.id.apellidop);
        ccpd= (EditText)findViewById(R.id.ccp);
        fechapd= (EditText)findViewById(R.id.fechap);
        correopd= (EditText)findViewById(R.id.emailp);
        passpd= (EditText)findViewById(R.id.passp);
        profesiopd=(EditText)findViewById(R.id.profep);

    }


    private static final String TAG = "Registro_PDS";
    public void pasarOpciPDS(View view){


        //Intent pasaropds = new Intent(this, opciones_PDS.class);

        //pasaropds.putExtra("Info",nombre.getText().toString());


        //startActivity(pasaropds);


        Log.d(TAG,"Exc");

        String t1p= nombrepd.getText().toString();
        String t2p= apellidopd.getText().toString();
        String t3p= ccpd.getText().toString();
        String t4p= fechapd.getText().toString();

        String t6p= correopd.getText().toString();
        String t7p= passpd.getText().toString();
        String t8p= profesiopd.getText().toString();



        int a  = t7p.length();
        try{
            if (t1p.matches("") || t2p.matches("") || t3p.matches("") || t4p.matches("") || t6p.matches("") || t7p.matches("") || t8p.matches("")) {

                Toast.makeText(getApplicationContext(), "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();
            }else {
                if (a>=6){

                    a=t3p.length();
                    if (a==10){
                        Intent pasaropds = new Intent(this, opciones_PDS.class);

                        //pasaropds.putExtra("Info",nombre.getText().toString());


                        startActivity(pasaropds);
                    }else{
                        Toast.makeText(getApplicationContext(), "VERIFIQUE SU NUMERO DE TELEFONO", Toast.LENGTH_SHORT).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(), "LA CONTRASEÑA DEBE CONTENER MAS DE 6 CARACTERES", Toast.LENGTH_SHORT).show();
                }

            }

        }catch (Exception e){

        }







    }


}
