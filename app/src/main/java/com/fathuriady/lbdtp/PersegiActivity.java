package com.fathuriady.lbdtp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Fathur on 3/29/2017.
 */

public class PersegiActivity extends AppCompatActivity{
    Double sisi,luas;
    TextView txtSisi1,txtSisi2,txtHasil;
    EditText edtSisi;
    Button btnHitung;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        edtSisi = (EditText) findViewById(R.id.edt_Sisi);


        txtSisi1 = (TextView) findViewById(R.id.txt_Sisi1);
        txtSisi2 = (TextView) findViewById(R.id.txt_Sisi2);

        txtHasil = (TextView) findViewById(R.id.txt_Hasil);

        btnHitung = (Button) findViewById(R.id.btn_Hitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi = Double.parseDouble(edtSisi.getText().toString());
                txtSisi1.setText(String.valueOf(sisi));
                txtSisi2.setText(String.valueOf(sisi));
                luas = sisi *sisi;
                txtHasil.setText(String.valueOf(luas));

            }
        });




    }
}
