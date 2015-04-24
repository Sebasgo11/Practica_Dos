package com.example.usuario.punto_5;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class Punto_5 extends ActionBarActivity {

    EditText nombre,correo,telefono;
    TextView name,email,phone,sexo,hob,ciudad,fecha;
    Button boton;
    CheckBox ch1,ch2,ch3,ch4;


    char sex;
    char hobbie;
    String text;
    int year,month,day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        final EditText nombre=(EditText)findViewById(R.id.idname);
        final EditText correo=(EditText)findViewById(R.id.idcorreo);
        final EditText telefono=(EditText)findViewById(R.id.idtelefono);
        final Spinner mySpinner=(Spinner) findViewById(R.id.spin);
        final DatePicker dpResult = (DatePicker) findViewById(R.id.date);
        final TextView name=(TextView)findViewById(R.id.tname);
        final TextView email=(TextView)findViewById(R.id.tcorreo);
        final TextView phone=(TextView)findViewById(R.id.ttelefono);
        final TextView sexo=(TextView)findViewById(R.id.tsexo);
        final TextView hob=(TextView)findViewById(R.id.thobbie);
        final TextView ciudad=(TextView)findViewById(R.id.tciudad);
        final TextView fecha=(TextView)findViewById(R.id.tfecha);

        Button boton= (Button)findViewById(R.id.Bok);

        boton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(nombre.getText());
                email.setText(correo.getText());
                phone.setText(telefono.getText());
                text= mySpinner.getSelectedItem().toString();
                ciudad.setText(text);
                year=dpResult.getYear();
                month=dpResult.getMonth();
                day=dpResult.getDayOfMonth();

                fecha.setText(new StringBuilder()

                                .append(day).append("-")
                                .append(month + 1).append("-")
                                .append(year).append(" "));

                dpResult.init(year, month, day, null);


                if(sex==1) {
                    sexo.setText("Masculino");
                }else if(sex==2){
                    sexo.setText("Femenino");
                }

                if(hobbie==1){
                   hob.setText("Futbol");
                }else if(hobbie==2){
                   hob.setText("Leer");
                }else if(hobbie==3){
                   hob.setText("Cine");
                }else if(hobbie==4){
                   hob.setText("Fifa15");
                }
            }
        }));
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mas:
                if (checked){
                   sex=1;
                }
                break;
            case R.id.fem:
                if (checked){
                    sex=2;
                }
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chk1:
                if (checked)
                    hobbie=1;
                break;
            case R.id.chk2:
                if (checked)
                    hobbie=2;
                break;
            case R.id.chk3:
                if (checked)
                    hobbie=3;
                    break;
            case R.id.chk4:
                if (checked)
                    hobbie=4;
                    break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_punto_5, menu);
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
