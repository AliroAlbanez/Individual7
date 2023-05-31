package com.example.individual7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variables para el mensaje toast a utilizar
        Context context =getApplicationContext();
        CharSequence text="Bienvenido/a a la Aplicación";
        int duracion = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duracion);
        toast.show()
    }
}
