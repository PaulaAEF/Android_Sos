package com.example.todasv;
import java.util.regex.Pattern;
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
import java.util.regex.Pattern;


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


        int n;


/*
        try {

            if (t1.matches("") || t2.matches("") || t3.matches("") || t4.matches("") || t5.matches("") || t6.matches("") || t7.matches("")) {
                Toast.makeText(getApplicationContext(), "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();


                }

            }else{
                Intent pasarta = new Intent(this, tipo_de_arreglo.class);


            n = pass.length();
            if(n=>6) {
                Toast.makeText(getApplicationContext(), "LA CONTRASEÑA DEBE CONTENER MAS DE 6 CARACTERES", Toast.LENGTH_SHORT).show();

                startActivity(pasarta);
            }else{


            }




            }catch(Exception e){

            }

*/


int a  = t7.length();
try{
    if (t1.matches("") || t2.matches("") || t3.matches("") || t4.matches("") || t5.matches("") || t6.matches("") || t7.matches("")) {

        Toast.makeText(getApplicationContext(), "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();
    }else {
        if (a>=6){

            a=t5.length();
            if (a==10){
                Intent pasarta = new Intent(this, tipo_de_arreglo.class);
                startActivity(pasarta);
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

