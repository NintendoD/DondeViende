package com.example.rodri.dondeviende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__iniciar_sesion);
    }

    public void onClick(View view) {
            Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnIngresar:
                break;
            case R.id.btnRegistrar:
                miIntent =  new Intent(Activity_IniciarSesion.this, Activity_Registrar.class);
                startActivity(miIntent);
                break;

        }
    }
}
