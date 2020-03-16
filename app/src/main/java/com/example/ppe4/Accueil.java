package com.example.ppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}
