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

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText firstname,lastname;
    TextView androidchoice;
    Button play,reset;
    Spinner spinner;
    String playerchoice,computerchoice;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstname = findViewById(R.id.fname);
        lastname=findViewById(R.id.lname);
        androidchoice =findViewById(R.id.androidchoice);
        play =findViewById(R.id.play);
        reset=findViewById(R.id.reset);
        spinner=findViewById(R.id.spinner);






play.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
   //String sname=firstname.getText();
  // String lname = lastname.getText();


   String pitem = (String) spinner.getSelectedItem();
        play_turn(pitem);

    }
});



    }

    private void play_turn(String playerchoice) {


        final Random rand = new Random();
        int randInt = rand.nextInt(100)+1;

        if(randInt<34)
        {
            computerchoice="rock";
            androidchoice.setText("ROCK");

        }
        else if(randInt>33 && randInt<67)
        {
            computerchoice="paper";
            androidchoice.setText("PAPER");
        }
        else if(randInt>67)
        {
            computerchoice="scissor";
            androidchoice.setText("SCISSOR");

        }



        if (playerchoice == computerchoice)
        {

            Toast.makeText(MainActivity.this,"Nobody Win",Toast.LENGTH_LONG).show();

        }



        else if(playerchoice=="rock" && computerchoice=="paper")
        {

            Toast.makeText(MainActivity.this,"Paper Beats Rock,Computer won",Toast.LENGTH_LONG).show();
        }

        else if(playerchoice=="rock" && computerchoice=="scissor")
        {

            Toast.makeText(MainActivity.this,"Rock beats scissors,You won",Toast.LENGTH_LONG).show();
        }








        else if(playerchoice=="paper" && computerchoice=="rock")
        {

            Toast.makeText(MainActivity.this,"Paper Beats Rock,You won",Toast.LENGTH_LONG).show();
        }


        else if(playerchoice=="paper" && computerchoice=="scissor")
        {

            Toast.makeText(MainActivity.this,"Scissor beat paper, Computer Won ",Toast.LENGTH_LONG).show();
        }




        else if(playerchoice=="scissor" && computerchoice=="paper")
        {

            Toast.makeText(MainActivity.this,"Scissor beats paper,you won",Toast.LENGTH_LONG).show();
        }
        else if(playerchoice=="scissor" && computerchoice=="rock")
        {

            Toast.makeText(MainActivity.this,"Rock beats scissor,Computer won",Toast.LENGTH_LONG).show();
        }






    }
    }


