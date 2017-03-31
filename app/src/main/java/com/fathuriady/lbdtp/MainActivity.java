package com.fathuriady.lbdtp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button BtnPersegi,BtnPersegiPanj,BtnSegitiga,BtnJajarGenj,BtnTrapesium,BtnLayKet,BtnLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnPersegi = (Button) findViewById(R.id.btn_Persegi);
        BtnPersegiPanj = (Button) findViewById(R.id.btn_PersegiPanj);
        BtnSegitiga = (Button) findViewById(R.id.btn_Segitiga);
        BtnJajarGenj = (Button) findViewById(R.id.btn_JajarGenj);
        BtnTrapesium = (Button) findViewById(R.id.btn_Trapesium);
        BtnLayKet = (Button) findViewById(R.id.btn_LayKet);
        BtnLingkaran = (Button) findViewById(R.id.btn_Lingkaran);

        BtnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PersegiActivity.class);
                startActivity(i);
            }
        });

    }
}
