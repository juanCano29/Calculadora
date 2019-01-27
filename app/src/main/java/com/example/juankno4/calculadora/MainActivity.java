package com.example.juankno4.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 /*para poder decir
 * reglas que se deven de cumplir para poder hacer algo*/

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnlimpiar, btneliminar,
            btndividir, btnmulti, btnrestar, btnsumar, btnpunto, btnigual;
    EditText pantallan, pantallanct;
    double numero1, numero2, resultado;
    String operador;

    @Override
    /*ciclo de vida de un activity*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*devuelven una vista casteo de esa vista al boton*/
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btndividir = findViewById(R.id.btndividir);
        btneliminar = findViewById(R.id.btneliminar);
        btnigual = findViewById(R.id.btnigual);
        btnlimpiar = findViewById(R.id.btnlimpiar);
        btnmulti = findViewById(R.id.btnmulti);
        btnpunto = findViewById(R.id.btnpunto);
        btnrestar = findViewById(R.id.btnrestar);
        btnsumar = findViewById(R.id.btnsumar);
        pantallan = findViewById(R.id.pantallan);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + "9");
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                pantallan.setText(pantallanct.getText().toString() + ".");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallanct = findViewById(R.id.pantallan);
                numero2 = Double.parseDouble(pantallanct.getText().toString());
               /* no regresa nada porque es void */

                if (operador.equals("+")) {
                    pantallan.setText("");
                    resultado = numero1 + numero2;
                }
                if (operador.equals("-")) {
                    pantallan.setText("");
                    resultado = numero1 - numero2;
                }
                if (operador.equals("X")) {
                    pantallan.setText("");
                    resultado = numero1 * numero2;
                }
                if (operador.equals("/")) {
                    pantallan.setText("");
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    }
                }
                pantallan.setText(String.valueOf(resultado));
            }
        });
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                pantallanct = findViewById(R.id.pantallan);
                numero1 = Double.parseDouble(pantallanct.getText().toString());
                pantallan.setText("");
            }
        });
        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                pantallanct = findViewById(R.id.pantallan);
                numero1 = Double.parseDouble(pantallanct.getText().toString());
                pantallan.setText("");
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "X";
                pantallanct = findViewById(R.id.pantallan);
                numero1 = Double.parseDouble(pantallanct.getText().toString());
                pantallan.setText("");
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                pantallanct = findViewById(R.id.pantallan);
                numero1 = Double.parseDouble(pantallanct.getText().toString());
                pantallan.setText("");
            }
        });
        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                pantallan.setText("");
            }
        });




    }
}
