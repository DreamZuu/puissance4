package com.example.puissance_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class nbjoueur extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nbjoueur);

        Button N1Joueur = findViewById(R.id.button_1Joueur);
        Button N2Joueur = findViewById(R.id.button_2Joueur);
        Button Quit = findViewById(R.id.button_quit);

        N1Joueur.setOnClickListener(this);
        N2Joueur.setOnClickListener(this);
        Quit.setOnClickListener(this);


        N1Joueur.setBackgroundColor((getResources().getColor(R.color.red)));
        N2Joueur.setBackgroundColor((getResources().getColor(R.color.yellow)));
        Quit.setBackgroundColor((getResources().getColor(R.color.black)));
    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_quit:
                new AlertDialog.Builder(v.getContext())
                        .setTitle("Quitter")
                        .setMessage("Etes vous sur? ")
                        .setPositiveButton("Confirmer", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                                finish();

                            }
                        })
                        .setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // do nothing
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
                break;

            case R.id.button_1Joueur:
                Intent intent1J = new Intent(this, saisiNom.class);
                intent1J.putExtra("NbPlayer","1");
                startActivity(intent1J);
                break;

            case R.id.button_2Joueur:
                Intent intent2J = new Intent(this, saisiNom.class);
                intent2J.putExtra("NbPlayer","2");
                startActivity(intent2J);
                break;
        }
    }
}