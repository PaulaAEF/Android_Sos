package com.example.todasv;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;


public class Registro_Cliente extends AppCompatActivity implements Response.Listener<JSONObject>,Response.ErrorListener{
    Button  registrar;
    EditText nombre, apellido,cc,fecha,tel,correo,pass;
    String server_URL="HTTP://ippp /archivo.php";
    AlertDialog.Builder builder;
    RequestQueue queue ;

    JsonObjectRequest JsonObjectRequest;
    ProgressDialog progress ;

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

        queue = Volley.newRequestQueue(getApplicationContext());
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CargarWebService();
            }
        });

    }

    private void CargarWebService() {
        progress = new ProgressDialog(getApplicationContext());
        progress.setMessage("Cargando....");
        progress.show();

        //localhost se cambia por la ip del equipo
        String URL= "nombre="+nombre.getText().toString()+"apellido="+apellido.getText().toString()+"cedula="+cc.getText().toString()+"fechaExpedicion="+fecha.getText().toString()
                +"telefono="+tel.getText().toString()+"correo="+correo.getText().toString()+"clave="+pass.getText().toString();
        URL=URL.replace(" ","%20");
        JsonObjectRequest= new JsonObjectRequest(Request.Method.GET,URL,null,this,this);
        queue.add(JsonObjectRequest);


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


    @Override
    public void onErrorResponse(VolleyError error) {
        progress.hide();
        Toast.makeText(getApplicationContext(),"Ocurrio un error y no puedo ser Registrado  "+error.toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResponse(JSONObject response) {

        Toast.makeText(getApplicationContext(),"Se ha registro exitosamente",Toast.LENGTH_SHORT).show();
        progress.hide();
        nombre.setText("");
        apellido.setText("");
        fecha.setText("");
        cc.setText("");
        tel.setText("");
        correo.setText("");
        pass.setText("");


    }
}
