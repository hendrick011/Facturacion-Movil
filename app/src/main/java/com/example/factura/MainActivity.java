package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    EditText editext1, editext2, editext3, editext4;

    Button botonguardar;

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

    //BASE DE DATOS

    Button botonamarillo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();

        ///////
        editext1 = (EditText) findViewById(R.id.editText1);
        editext2 = (EditText) findViewById(R.id.editText2);


        botonguardar = (Button) findViewById(R.id.botonamarillo);





//////////////////////////////////////////
        editext1 = (EditText) findViewById(R.id.editText1);
        editext2 = (EditText) findViewById(R.id.editText2);
        editext3 = (EditText) findViewById(R.id.editText3);
        editext4 = (EditText) findViewById(R.id.editText4);

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
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"1"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"1"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"1"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"1"));

            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"2"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"2"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"2"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"2"));
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"3"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"3"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"3"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"3"));
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"4"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"4"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"4"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"4"));
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"5"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"5"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"5"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"5"));
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"6"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"6"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"6"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"6"));
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"7"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"7"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"7"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"7"));
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"8"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"8"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"8"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"8"));
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"9"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"9"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"9"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"9"));
            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"0"));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"0"));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"0"));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"0"));
            }
        });

        botondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().insert(editext1.getText().length(),"."));
                editext2.setText(editext2.getText().insert(editext2.getText().length(),"."));
                editext3.setText(editext3.getText().insert(editext3.getText().length(),"."));
                editext4.setText(editext4.getText().insert(editext4.getText().length(),"."));

            }
        });

        botonrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.setText(editext1.getText().delete(editext1.getText().length()-1,editext1.getText().length()));
                editext2.setText(editext2.getText().delete(editext2.getText().length()-1,editext2.getText().length()));
                editext3.setText(editext3.getText().delete(editext3.getText().length()-1,editext3.getText().length()));
                editext4.setText(editext4.getText().delete(editext4.getText().length()-1,editext4.getText().length()));

            }
        });


    }
    public void Guardar(View view){
        String nombre = editext1.getText().toString();
        String precio = editext2.getText().toString();
        BaseHelper baseHelper = new BaseHelper(this,"FACTURADB", null, 1);
        SQLiteDatabase db = baseHelper.getWritableDatabase();
        if (db!=null){
            ContentValues Registro = new ContentValues();
            Registro.put("Nombre",nombre);
            Registro.put("Precio", precio);
            long i = db.insert("productos",null,Registro);
            if (i>0){
                Toast.makeText(this, "Contacto Agegado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
            }
        }

    }


}