package com.example.clase02_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEnviar;
    TextView txtBienvenido;
    String [] textos = new String[5];
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = findViewById(R.id.btnSaludo);
        txtBienvenido = findViewById(R.id.txtSaludo);
        layout = findViewById(R.id.layout);

        textos[0] ="Un ejemplo de Android";
        textos[1] ="Hola mundo!";
        textos[2] ="Estamos Ready";
        textos[3] ="Todo esfuerzo vale la pena";
        textos[4] ="Divide y vencerás";


        btnEnviar.setOnClickListener(this);


        /*pasos paraprogramarbasiacmente:
        1- diseñarel layout > Asignara losview interactivos () -> IDs
        2- Enel archivoJava asociado:
            Por cada Viewa interactuar definir un objetoJava correspondiente con un objetro xml

        3- Activar el evento onclickListener medianteel metodo SetOnClickListener
        */

    }
 /*Saca el ramdom
    @Override
    public void onClick(View view) {
        txtBienvenido.setText(textos[(int) (Math.random()*5)]);
    }*/
    private String generarSaludo(){

        //Primera forma con la clase math
        int possicion = (int) (Math.random()*textos.length);
        return textos[possicion];

        /*Segunda forma (Instanciando la clase Random)
        Random pos = new Random();
        return textos[pos.nextInt(textos.length)];*/
    }
    private int generarColor(){
        Random colorAleatorio = new Random();
        int color = Color.argb(255, colorAleatorio.nextInt(256),colorAleatorio.nextInt(256),colorAleatorio.nextInt(256));
        return color;
    }

    @Override
    public void onClick(View view) {
    txtBienvenido.setText(generarSaludo());
    layout.setBackgroundColor(generarColor());
    }

}