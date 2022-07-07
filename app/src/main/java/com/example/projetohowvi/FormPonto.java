package com.example.projetohowvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Calendar;

public class FormPonto extends AppCompatActivity {

    private Button bt_deslogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ponto);


        getSupportActionBar().hide();
        IniciarComponentes();

        bt_deslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cria evento de clique no botão deslogar

                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(FormPonto.this, FormLogin.class);
                startActivity(intent);
                finish();

        }
    });
}
            private void IniciarComponentes() {
                bt_deslogar = findViewById(R.id.bt_deslogar);
            }
}