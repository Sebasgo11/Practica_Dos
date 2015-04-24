package com.example.usuario.punto_4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Punto_4 extends ActionBarActivity {

    private RadioGroup Grupo;

    RadioButton b1,b2,b3,b4;
    int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.figuras);

        final EditText lado = (EditText) findViewById(R.id.ilado);
        final EditText base = (EditText) findViewById(R.id.ibase);
        final EditText altura = (EditText) findViewById(R.id.ialtura);
        final EditText radio = (EditText) findViewById(R.id.iradio);
        final EditText lado1 = (EditText) findViewById(R.id.ilado1);
        final EditText lado2 = (EditText) findViewById(R.id.ilado2);

        final TextView area = (TextView) findViewById(R.id.iarea);

        Grupo = (RadioGroup) findViewById(R.id.radioGroup);


        Button Btn= (Button)findViewById(R.id.Btn);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (operation){

                    case 1:{
                        String valor1 = lado.getText().toString();
                        if(valor1.equals("")) {
                        }else{
                            valor1 = lado.getText().toString();
                            double nro1 = Double.parseDouble(valor1);
                            double a = nro1 * nro1;
                            String res = String.valueOf(a);
                            area.setText(res);
                        }
                        break;
                    }
                    case 2:{
                        String valor1=base.getText().toString();
                        String valor2=altura.getText().toString();
                        if(valor1.equals("") || valor2.equals("")) {
                        }else{
                            valor1 = base.getText().toString();
                            valor2 = altura.getText().toString();
                            double nro1 = Double.parseDouble(valor1);
                            double nro2 = Double.parseDouble(valor2);
                            double a = (nro1 * nro2) / (2);
                            String res = String.valueOf(a);
                            area.setText(res);
                        }
                        break;}
                    case 3:{
                        String valor1=radio.getText().toString();
                        if(valor1.equals("")) {
                        }else{
                            valor1 = radio.getText().toString();
                            double nro1 = Double.parseDouble(valor1);
                            double a = Math.PI * (nro1 * nro1);
                            String res = String.valueOf(a);
                            area.setText(res);
                        }
                        break;}
                    case 4:{
                        String valor1=lado1.getText().toString();
                        String valor2=lado2.getText().toString();
                        if(valor1.equals("") || valor2.equals("")) {
                        }else{
                            valor1 = lado1.getText().toString();
                            valor2 = lado2.getText().toString();
                            double nro1 = Double.parseDouble(valor1);
                            double nro2 = Double.parseDouble(valor2);
                            double a = nro1 * nro2;
                            String res = String.valueOf(a);
                            area.setText(res);
                        }
                        break;}

                }
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.icuadrado:
                if (checked){
                    operation=1;
                }
                break;
            case R.id.itriangulo:
                if (checked){
                    operation=2;
                }
                break;
            case R.id.icirculo:
                if (checked){
                    operation=3;
                }
                break;
            case R.id.irectangulo:
                if (checked){
                    operation=4;
                }
                break;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_punto_4, menu);
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
