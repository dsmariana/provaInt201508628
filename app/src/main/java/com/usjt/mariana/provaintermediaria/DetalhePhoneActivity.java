package com.usjt.mariana.provaintermediaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mariana on 25/10/2017.
 * ra: 201508628
 */

public class DetalhePhoneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_phone);

        Intent intent = getIntent();
        String texto = intent.getStringExtra(MainActivity.CHAVE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(texto);

        ViewGroup layout = findViewById(R.id.txt_numero);
        layout.addView(textView);
    }
}




