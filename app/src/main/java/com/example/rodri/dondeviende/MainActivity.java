package com.example.rodri.dondeviende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent miIntent = new Intent(MainActivity.this,Activity_IniciarSesion.class   );
        startActivity(miIntent);

    }



}
