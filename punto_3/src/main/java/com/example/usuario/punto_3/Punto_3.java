package com.example.usuario.punto_3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Punto_3 extends ActionBarActivity {

   EditText quiz,practica,proyecto,expo,nota;
   Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nota);

        final EditText quiz=(EditText)findViewById(R.id.iquices);
        final EditText practica=(EditText)findViewById(R.id.ipracticas);
        final EditText proyecto=(EditText)findViewById(R.id.iproyecto);
        final EditText expo=(EditText)findViewById(R.id.iexposiciones);

        final TextView nota=(TextView)findViewById(R.id.inotadef);


        Button Boton= (Button)findViewById(R.id.Bcalcular);

        Boton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor1=quiz.getText().toString();
                String valor2=practica.getText().toString();
                String valor3=proyecto.getText().toString();
                String valor4=expo.getText().toString();
                double nro1=Double.parseDouble(valor1);
                double nro2=Double.parseDouble(valor2);
                double nro3=Double.parseDouble(valor3);
                double nro4=Double.parseDouble(valor4);
                double definitiva=(nro1*0.15)+(nro2*0.10)+(nro3*0.40)+(nro4*0.35);

                String res=String.valueOf(definitiva);
                nota.setText(res);
            }
        }));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_punto_3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
