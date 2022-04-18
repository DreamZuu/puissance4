package com.example.puissance_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView[][] puissance4 = new TextView[6][7];
    private String[][] tmpP4 = new String[6][7];
    private int[] indice = new int[7];
    private int[] NBR_Victory = new int[2];
    private String txtJoueur ="";
    private String NomJ1 ="";
    private String NomJ2 ="";
    private String NBjoueur ="";
    private boolean win = false;
    private int tour = 0;
    private TextView J1T, J2T, J1sc, J2sc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Game board buttons
        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);

        // Auxiliary buttons
        Button Reset = findViewById(R.id.button_reset);


        // On click listeners
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        Reset.setOnClickListener(this);


        J1T = findViewById(R.id.text_view_p1);
        J2T = findViewById(R.id.text_view_p2);

        J1sc = findViewById(R.id.score_p1);
        J2sc = findViewById(R.id.score_p2);


        Intent gameInfo = getIntent();

        NBjoueur = gameInfo.getStringExtra("NBRJOUEUR");

        if (NBjoueur.equals("1")) {
            NomJ1 = gameInfo.getStringExtra("NomJ1");
            J1T.setText(NomJ1+": ");
            J2T.setText("IA: ");
        }
        if (NBjoueur.equals("2")) {
            NomJ1 = gameInfo.getStringExtra("NomJ1");
            NomJ2 = gameInfo.getStringExtra("NomJ2");
            J1T.setText(NomJ1+": ");
            J2T.setText(NomJ2+": ");
        }



        Log.v("",""+NomJ1 + NomJ2);

        for(int i = 0; i < 7; i++){
            indice[i] = 0;
        }
        for(int i = 0; i < 2; i++){
            NBR_Victory[i] = 0;
        }

        J1sc.setText(String.valueOf(NBR_Victory[1]));
        J2sc.setText(String.valueOf(NBR_Victory[0]));

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                tmpP4[i][j] = "";
                String buttonID = "button_" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                puissance4[i][j] = findViewById(resID);
                puissance4[i][j].setText("");
            }
        }
    }


    public void onClick(View v) {
        if (tour%2 == 1){

        }else {

        }

        switch (v.getId()){
            // --------- Plateau de jeu ---------
            case R.id.button_0:
                if(indice[0] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[0]][0] = txtJoueur;
                            indice[0]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[0]][0] = txtJoueur;
                        indice[0]++;
                        tour++;
                    }
                }

            break;

            case R.id.button_1:
                if(indice[1] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[1]][1] = txtJoueur;
                            indice[1]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[1]][1] = txtJoueur;
                        indice[1]++;
                        tour++;
                    }

                }
                break;

            case R.id.button_2:
                if(indice[2] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[2]][2] = txtJoueur;
                            indice[2]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[2]][2] = txtJoueur;
                        indice[2]++;
                        tour++;
                    }

                }

                break;

            case R.id.button_3:
                if(indice[3] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[3]][3] = txtJoueur;
                            indice[3]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[3]][3] = txtJoueur;
                        indice[3]++;
                        tour++;
                    }

                }

                break;
            case R.id.button_4:
                if(indice[4] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[4]][4] = txtJoueur;
                            indice[4]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[4]][4] = txtJoueur;
                        indice[4]++;
                        tour++;
                    }

                }

                break;
            case R.id.button_5:
                if(indice[5] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[5]][5] = txtJoueur;
                            indice[5]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[5]][5] = txtJoueur;
                        indice[5]++;
                        tour++;
                    }

                }

                break;
            case R.id.button_6:
                if(indice[6] <6 && win == false) {
                    if(NBjoueur.equals("1")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                            tmpP4[indice[6]][6] = txtJoueur;
                            indice[6]++;
                            tour++;
                        }
                    }
                    if(NBjoueur.equals("2")){
                        if(tour%2 == 0){
                            txtJoueur ="x";
                        } else {
                            txtJoueur ="o";
                        }
                        tmpP4[indice[6]][6] = txtJoueur;
                        indice[6]++;
                        tour++;
                    }

                }

                break;
            // --------- Fin du plateau de jeu ---------

            case R.id.button_reset:
                hardReset();
                break;
        }

        ConversionP4();
        updateNBVictory();
        Random r = new Random();
        if(NBjoueur.equals("1")) {
            int valeur = r.nextInt(6);
            if (indice[valeur] < 6 && win == false) {
                if (tour % 2 == 1) {
                    txtJoueur = "o";
                    tmpP4[indice[valeur]][valeur] = txtJoueur;
                    indice[valeur]++;
                    tour++;
                }
            }
        }

        if(winCheck()){
            if (tour%2==0) {

                NBR_Victory[1]++;

                Log.v("","Joueur1 "+NBR_Victory[1]);
            } else {
                NBR_Victory[0]++;
                Log.v("","Joueur2 "+NBR_Victory[0]);
            }
        }

    }


    public void updateNBVictory(){
        J1sc.setText(String.valueOf(NBR_Victory[1]));
        J2sc.setText(String.valueOf(NBR_Victory[0]));
    }
    // Game reset
    public  void hardReset(){
        for (int i = 0; i < 7; i++) {
            indice[i] = 0;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tmpP4[i][j] ="";
            }
        }
        win = false;
    };// End game reset

    // Local array into the game board
    public void ConversionP4(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (tmpP4[i][j] == ""){
                    puissance4[i][j].setBackgroundColor(getResources().getColor(R.color.white));
                }
                if (tmpP4[i][j] == "x") {
                    puissance4[i][j].setBackgroundColor(getResources().getColor(R.color.red));
                }
                if (tmpP4[i][j] == "o") {
                    puissance4[i][j].setBackgroundColor(getResources().getColor(R.color.yellow));
                }
                if (tmpP4[i][j] == "w") {
                    puissance4[i][j].setBackgroundColor(getResources().getColor(R.color.purple_200));
                }
            }
        }
    }; // End ConversionP4

    // Win check
   public boolean winCheck(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++) {
                // Vertical Win check
                    if (i >= 3) {
                        if (tmpP4[i][j] != "") {

                            if ((tmpP4[i][j].equals(tmpP4[i - 1][j]) &&
                                    tmpP4[i][j].equals(tmpP4[i - 2][j]) &&
                                    tmpP4[i][j].equals(tmpP4[i - 3][j]))) {
                                for (int k = 0; k < 4; k++) {
                                    puissance4[i-k][j].setBackgroundColor(getResources().getColor(R.color.purple_200));
                                }
                                win = true;

                            }
                        }
                    }

                // Vertical horizontal win check
                    if (j >= 3) {
                        if (tmpP4[i][j] != "") {

                            if ((tmpP4[i][j].equals(tmpP4[i][j - 1]) &&
                                    tmpP4[i][j].equals(tmpP4[i][j - 2]) &&
                                    tmpP4[i][j].equals(tmpP4[i][j - 3]))) {
                                for (int k = 0; k < 4; k++) {
                                    puissance4[i][j-k].setBackgroundColor(getResources().getColor(R.color.purple_200));
                                }
                                win = true;
                            }
                        }
                    }
                // Diagonal \ Win check
                    if (i >= 3 && j <= 3) {
                        if (tmpP4[i][j] != "") {

                            if ((tmpP4[i][j].equals(tmpP4[i - 1][j + 1]) &&
                                    tmpP4[i][j].equals(tmpP4[i - 2][j + 2]) &&
                                    tmpP4[i][j].equals(tmpP4[i - 3][j + 3]))) {
                                for (int k = 0; k < 4; k++) {
                                    puissance4[i-k][j+k].setBackgroundColor(getResources().getColor(R.color.purple_200));
                                }
                                win = true;
                            }
                        }
                    }
                // Diagonal / Win check
                    if (i >= 3 && j >= 3) {
                        if (tmpP4[i][j] != "") {

                            if ((tmpP4[i][j].equals(tmpP4[i - 1][j - 1]) &&
                                    tmpP4[i][j].equals(tmpP4[i - 2][j - 2]) &&
                                    tmpP4[i][j].equals(tmpP4[i - 3][j - 3]))) {
                                for (int k = 0; k < 4; k++) {
                                    puissance4[i-k][j-k].setBackgroundColor(getResources().getColor(R.color.purple_200));
                                }
                                win = true;
                            }
                        }
                    }
            }
        }
        return win;
   };// End Win check

}