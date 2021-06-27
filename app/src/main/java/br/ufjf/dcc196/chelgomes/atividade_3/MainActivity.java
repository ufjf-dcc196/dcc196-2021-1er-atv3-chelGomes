package br.ufjf.dcc196.chelgomes.atividade_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPrimeiroNumero;
    private EditText editTextSegundoNumero;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPrimeiroNumero = findViewById(R.id.editTextPrimeiroNumero);
        editTextSegundoNumero = findViewById(R.id.editTextSegundoNumero);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void calculoSoma(View view){
        Double calculoNumero1 = Double.parseDouble(editTextPrimeiroNumero.getText().toString());
        Double calculoNumero2 = Double.parseDouble(editTextSegundoNumero.getText().toString());

        Double Soma = calculoNumero1 + calculoNumero2;

        textViewResultado.setText(Soma.toString());

    }

    /*Double Subtracao = calculoNumero1 - calculoNumero2;
    textViewResultado.setText(Subtracao.toString());*/
}