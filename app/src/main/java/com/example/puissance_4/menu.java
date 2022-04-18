package com.example.puissance_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button play = findViewById(R.id.button_play);
        Button quit = findViewById(R.id.button_quit);

        play.setOnClickListener(this);
        quit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_play:
                Intent goPlay = new Intent(this, nbjoueur.class);
                startActivity(goPlay);
                break;

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

        }
    }
}