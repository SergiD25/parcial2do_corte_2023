package com.example.parcial2_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText numero_1 , numero_2;
    private Button suma , resta;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_1 = findViewById(R.id.numero1);
        numero_2 = findViewById(R.id.numero2);
        resultado =  findViewById(R.id.resultado);






    }

    public void resultado1(View view)
    {
        String numeroa = numero_1.getText().toString();
        int num1 =Integer.parseInt(numeroa);

        String numerob = numero_2.getText().toString();
        int num2 =Integer.parseInt(numerob);


        Suma sumita = new Suma();
        resultado.setText(Integer.toString(sumita.Suma(num1,num2)));
    }

    public void resultado2(View view)
    {
        String numeroa = numero_1.getText().toString();
        int num1 =Integer.parseInt(numeroa);

        String numerob = numero_2.getText().toString();
        int num2 =Integer.parseInt(numerob);



        Resta restita = new Resta();
        resultado.setText(Integer.toString(restita.Resta(num1,num2)));
    }
}