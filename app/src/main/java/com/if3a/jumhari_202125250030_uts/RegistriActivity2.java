package com.if3a.jumhari_202125250030_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistriActivity2 extends AppCompatActivity {
    private EditText etUserName, etPasword, etEmail;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registri2);

        etUserName = findViewById(R.id.et_nama);
        etPasword = findViewById(R.id.et_pasword);
        etEmail = findViewById(R.id.et_email);

        btnDaftar = findViewById(R.id.bt_Signup);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etUserName = etUserName.getText().toString();

            }
        }

    });
        }

}