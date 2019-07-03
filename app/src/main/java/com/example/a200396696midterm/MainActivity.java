package com.example.a200396696midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText firstname, lastname;
    TextView androidchoice;
    Button play, reset;
    Spinner spinner;
    String playerchoice, computer_choice;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        androidchoice = findViewById(R.id.androidchoice);
        play = findViewById(R.id.play);
        reset = findViewById(R.id.reset);
        spinner = findViewById(R.id.spinner);
        db = FirebaseDatabase.getInstance().getReference("game");

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 playerchoice= (String) spinner.getSelectedItem();
                String message = play_turn(playerchoice);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
               // Game g= new Game();
                //db.push().getKey();
                //db.child().setValue();


            }
        });
    }

    private  String play_turn(String playerchoice) {

         String p= playerchoice;
        // Toast.makeText(MainActivity.this,p,Toast.LENGTH_LONG).show();

        String computer_choice = " ";
        final Random rand = new Random();
        int randInt = rand.nextInt(100) + 1;

        if (randInt < 34) {
            computer_choice = "ROCK";
            androidchoice.setText("ROCK");

        } else if (randInt > 33 && randInt < 67) {
            computer_choice = "PAPER";
            androidchoice.setText("PAPER");
        } else if (randInt > 67) {
            computer_choice = "SCISSOR";
            androidchoice.setText("SCISSOR");

        }


        if (p == computer_choice) {

            return "Nobody Win";

        } else if (p == "ROCK" && computer_choice == "PAPER") {

            return "Paper Beats Rock,Computer won";
        } else if (p == "ROCK" && computer_choice == "SCISSOR") {

            return "Rock beats scissors,You won";
        } else if (p == "PAPER" && computer_choice == "ROCK") {

            return "Paper Beats Rock,You won";
        } else if (p == "PAPER" && computer_choice == "SCISSOR") {
            return "Scissor beat paper, Computer Won ";
        } else if (p== "SCISSOR" && computer_choice == "PAPER") {
            return "Scissor beats paper,you won";
        } else if (p == "SCISSOR" && computer_choice == "ROCK") {

            return "Rock beats scissor,Computer won";
        }
        else
            return "no idea";

    } }