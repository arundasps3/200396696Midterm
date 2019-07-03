package com.example.a200396696midterm;

public class Game
{
    private Integer Gameid;
    private String FirstName;
    private String LastName;
    private String Choice;
    private String Winner;



    public  Game()

    {

    }

    public Game(Integer gameid, String firstName, String lastName, String choice, String winner) {
        Gameid = gameid;
        FirstName = firstName;
        LastName = lastName;
        Choice = choice;
        Winner = winner;
    }
}
