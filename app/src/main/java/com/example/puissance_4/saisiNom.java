package com.example.puissance_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class saisiNom extends AppCompatActivity implements View.OnClickListener {
    private String nbrJ = null;
    private EditText ETj1;
    private EditText ETj2;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisi_nom);

        Intent inte = getIntent();


        Button Jouer = findViewById(R.id.button_jouer);

        Jouer.setOnClickListener(this);

        ETj1 = findViewById(R.id.editTextJoueur1);

        ETj2 = findViewById(R.id.editTextJoueur2);


        if(inte.hasExtra("NbPlayer")){
            nbrJ = inte.getStringExtra("NbPlayer");
        }

        if(nbrJ.equals("1")){
            ETj2.setVisibility(View.INVISIBLE);
            ETj2.setBackgroundColor(getResources().getColor(R.color.black));
        }
        if(nbrJ.equals("2")){
            ETj2.setVisibility(View.VISIBLE);
            ETj2.setVisibility(View.VISIBLE);
        }


    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_jouer:


                if(nbrJ.equals("1")) {
                    Intent intent1J = new Intent(this, MainActivity.class);
                    intent1J.putExtra("NBRJOUEUR", nbrJ);
                    intent1J.putExtra("NomJ1", ETj1.getText().toString());
                    startActivity(intent1J);
                }
                if(nbrJ.equals("2")) {
                    Intent intent2J = new Intent(this, MainActivity.class);
                    intent2J.putExtra("NBRJOUEUR", nbrJ);
                    intent2J.putExtra("NomJ1", ETj1.getText().toString());
                    intent2J.putExtra("NomJ2", ETj2.getText().toString());
                    startActivity(intent2J);
                }

                break;


        }
    }
}