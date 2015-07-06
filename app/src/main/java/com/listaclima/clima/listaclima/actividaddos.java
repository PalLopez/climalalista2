package com.listaclima.clima.listaclima;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class actividaddos extends ActionBarActivity {

    private ImageView img;
    private TextView dia;
    private TextView clima;
    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);

         img = (ImageView) findViewById(R.id.img);
         dia = (TextView) findViewById(R.id.dia);
         clima = (TextView) findViewById(R.id.clima);
         temp = (TextView) findViewById(R.id.tem);


        Bundle datos=getIntent().getExtras();



        dia.setText(datos.getString("Dia"));
        clima.setText(datos.getString("Clima"));
        temp.setText(datos.getString("Temperatura"));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activitytwo, menu);
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
