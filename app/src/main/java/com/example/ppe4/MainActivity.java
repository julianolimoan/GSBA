package com.example.ppe4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        private EditText login;
        private EditText motdepasse;
        private Button valider;
        private Button inscription;
        private RadioButton visiteur,comptable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.log);
        motdepasse = findViewById(R.id.mdp);
        valider = findViewById(R.id.val);
        valider.setText("Valider");
        inscription = findViewById(R.id.ins);
        inscription.setText("Inscription");
        visiteur = findViewById(R.id.visiteur);
        comptable = findViewById(R.id.comptable);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logincontent = login.getText().toString();
                String mdpcontent = motdepasse.getText().toString();
                if(visiteur.isChecked()){
                    gotoUrl("http://mcol.myqnapcloud.com/PPE4/api.php?mode=login&login="+logincontent+"&mdp="+mdpcontent+"&type=visiteur");
                }else if(comptable.isChecked()){
                    gotoUrl("http://mcol.myqnapcloud.com/PPE4/api.php?mode=login&login="+logincontent+"&mdp="+mdpcontent+"&type=comptable");
                }
                Intent i = new Intent(MainActivity.this, Accueil.class);
                startActivity(i);
                finish();


            }

        });


    }
    public void gotoUrl(final String url){
        RequestByURL req = new RequestByURL();
        req.execute(url);
    }
}
