package com.example.aulamobile1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText numero1;

    private EditText numero2;

    private TextView resultado;

    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.main_text_numero1);
        numero2 = findViewById(R.id.main_text_numero2);
        resultado = findViewById(R.id.main_label_resultado);
        calcular = findViewById(R.id.main_button_calcular);

resultado.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double valor1 = Double.parseDouble(numero1.getText().toString());
        double valor2 = Double.parseDouble(numero2.getText().toString());
        double soma = valor1 + valor2;

        resultado.setText("A soma é: "+soma);
    }
}