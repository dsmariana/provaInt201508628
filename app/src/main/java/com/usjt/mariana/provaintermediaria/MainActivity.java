package com.usjt.mariana.provaintermediaria;
/**
 * Created by Mariana on 25/10/2017.
 * ra: 201508628
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String CHAVE = "com.usjt.mariana.provaintermediaria.chave";
    private EditText pNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pNumero = (EditText) findViewById(R.id.pNumero);

    }

    public String converter(String num){
        num.replace('A', '2');
        num.replace('B', '2');
        num.replace('C', '2');
        num.replace('D', '3');
        num.replace('E', '3');
        num.replace('F', '3');
        num.replace("G", "4");
        num.replace('H', '4');
        num.replace('I', '4');
        num.replace('J', '5');
        num.replace('K', '5');
        num.replace('L', '5');
        num.replace('M', '6');
        num.replace('N', '6');
        num.replace('O', '6');
        num.replace('P', '7');
        num.replace('Q', '7');
        num.replace('R', '7');
        num.replace('S', '7');
        num.replace('T', '8');
        num.replace('U', '8');
        num.replace('V', '8');
        num.replace('W', '9');
        num.replace('X', '9');
        num.replace('Y', '9');
        num.replace('Z', '9');
        return num.toLowerCase();
    }

    public void ligar(View view){
        String numero = pNumero.getText().toString();
        String cv = converter(numero);
        Intent intent = new Intent(this, DetalhePhoneActivity.class);
        intent.putExtra(CHAVE, cv);
        startActivity(intent);
    }
}
