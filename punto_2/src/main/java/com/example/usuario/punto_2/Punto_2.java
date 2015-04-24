package com.example.usuario.punto_2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Punto_2 extends ActionBarActivity {

    private RadioGroup Grupo;

    EditText op1,op2;
    TextView resultado;
    RadioButton b1,b2,b3,b4;
    int operation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punto_2);

        final EditText op1 = (EditText) findViewById(R.id.operando1);
        final EditText op2 = (EditText) findViewById(R.id.operando2);

        resultado = (TextView) findViewById(R.id.result);

        Grupo = (RadioGroup) findViewById(R.id.radioGroup);

        Button Btn= (Button)findViewById(R.id.Btn1);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (operation){

                    case 1:{
                        String valor1=op1.getText().toString();
                        String valor2=op2.getText().toString();
                        double nro1=Double.parseDouble(valor1);
                        double nro2=Double.parseDouble(valor2);
                        double suma=nro1+nro2;
                        String res=String.valueOf(suma);
                        resultado.setText(res);
                        break;
                    }
                    case 2:{
                        String valor1=op1.getText().toString();
                        String valor2=op2.getText().toString();
                        double nro1=Double.parseDouble(valor1);
                        double nro2=Double.parseDouble(valor2);
                        double resta=nro1-nro2;
                        String res=String.valueOf(resta);
                        resultado.setText(res);
                        break;}
                    case 3:{
                        String valor1=op1.getText().toString();
                        String valor2=op2.getText().toString();
                        double nro1=Double.parseDouble(valor1);
                        double nro2=Double.parseDouble(valor2);
                        double multi=nro1*nro2;
                        String res=String.valueOf(multi);
                        resultado.setText(res);
                        break;}
                    case 4:{
                        String valor1=op1.getText().toString();
                        String valor2=op2.getText().toString();
                        double nro1=Double.parseDouble(valor1);
                        double nro2=Double.parseDouble(valor2);
                        double div=nro1/nro2;
                        String res=String.valueOf(div);
                        resultado.setText(res);
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
                case R.id.isum:
                    if (checked){
                        operation=1;
                    }
                        break;
                case R.id.ires:
                    if (checked){
                        operation=2;
                    }
                        break;
                case R.id.imulti:
                    if (checked){
                        operation=3;
                    }
                    break;
                case R.id.idiv:
                    if (checked){
                        operation=4;
                    }
                    break;
            }
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_punto_2, menu);
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
