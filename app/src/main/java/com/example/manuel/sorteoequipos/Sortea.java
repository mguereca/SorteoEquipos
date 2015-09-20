package com.example.manuel.sorteoequipos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Sortea extends ActionBarActivity {

   Button btnSortea;
   TextView tvNumero;
    Equipos equipos;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortea);

        tvNumero = (TextView)findViewById(R.id.tvNumero);
        btnSortea = (Button)findViewById(R.id.btnSortea);

        Bundle bundle = getIntent().getExtras();
        num = bundle.getString("numero");

        equipos = new Equipos(Integer.parseInt(num));

        btnSortea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumero.setText(equipos.escribeNumero());
            }
        });
    }


}
