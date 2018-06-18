package com.example.rodri.dondeviende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__registrar);
    }

    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnRegistrarUsuario:

                break;
            case R.id.btnCancelar:
                finish();
                break;

        }
    }
}
