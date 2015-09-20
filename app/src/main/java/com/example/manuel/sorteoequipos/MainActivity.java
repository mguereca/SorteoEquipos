package com.example.manuel.sorteoequipos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText etEquipo;
    private Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEquipo = (EditText)findViewById(R.id.etEquipo);
        btnInicio = (Button)findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActivity(v,etEquipo.getText().toString());
            }
        });
    }

    private void lanzarActivity(View v, String s) {
        Intent i = new Intent(MainActivity.this,Sortea.class);
        i.putExtra("numero",etEquipo.getText().toString());
        startActivity(i);
    }

}
