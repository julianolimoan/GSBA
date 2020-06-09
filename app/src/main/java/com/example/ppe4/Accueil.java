package com.example.ppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {
    private Button AjoutFicheF;
    private Button AjoutFicheH;
    private Button SuiviFiche;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        AjoutFicheF = findViewById(R.id.fichef);
        AjoutFicheF.setText("Ajout frais au forfait");
        AjoutFicheH = findViewById(R.id.ficheh);
        AjoutFicheH.setText("Ajout frais hors forfait");
        SuiviFiche = findViewById(R.id.suivi);
        SuiviFiche.setText("Suivi fiche forfait");

        AjoutFicheF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Accueil.this,SaisirFicheActivity.class);
                startActivity(intent);

            }

        });
        AjoutFicheH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Accueil.this,FicheHorsForfait.class);
                startActivity(intent);
            }
        });    }
}
 //Ok