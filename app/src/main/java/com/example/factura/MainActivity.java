package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button boton0;
    Button botondot;
    Button botonrojo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();

        editText = (EditText) findViewById(R.id.editText1);
        editText = (EditText) findViewById(R.id.editText2);
        editText = (EditText) findViewById(R.id.editText3);
        editText = (EditText) findViewById(R.id.editText4);

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);
        boton5 = (Button) findViewById(R.id.boton5);
        boton6 = (Button) findViewById(R.id.boton6);
        boton7 = (Button) findViewById(R.id.boton7);
        boton8 = (Button) findViewById(R.id.boton8);
        boton9 = (Button) findViewById(R.id.boton9);
        boton0 = (Button) findViewById(R.id.boton0);
        botondot = (Button) findViewById(R.id.botondot);
        botonrojo = (Button) findViewById(R.id.botonrojo);



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"1"));
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"2"));
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"3"));
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"4"));
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"5"));
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"6"));
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"7"));
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"8"));
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"9"));
            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"0"));
            }
        });

        botondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"."));
            }
        });

        botonrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().delete(editText.getText().length()-1,editText.getText().length()));
            }
        });


    }



}