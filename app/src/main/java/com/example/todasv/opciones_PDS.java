package com.example.todasv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class opciones_PDS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones__pds);
    }

    public void pasarPP(View view){
        Intent pasarpp = new Intent(this, perfilPDS.class);
        startActivity(pasarpp);
    }

    public void pasarListSol(View view){
        Intent pasarls = new Intent(this, MainActivity.class);
        startActivity(pasarls);
    }

}
