package com.example.anemia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_inferior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inferior);
    }

    public void llamar_opciones(View view) {
        Intent intencion = new Intent(this,OpcionesActivity.class);
        startActivity(intencion);
    }

}