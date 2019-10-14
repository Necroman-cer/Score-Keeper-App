package com.example.android.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperapp.R;

public class MainActivity extends AppCompatActivity {

    int scoreFootballTeamA = 0;
    int scoreFootballTeamB = 0;

    int foulFootballTeamA = 0;
    int foulFootballTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addOneScoreForTeamA(View view) {
        scoreFootballTeamA = scoreFootballTeamA + 1;
        displayForTeamA(scoreFootballTeamA);
    }


    public void addOneFoulForTeamA(View view) {
        foulFootballTeamA = foulFootballTeamA + 1;
        displayFoulForTeamA(foulFootballTeamA);
    }


    // for team B

    public void addOneScoreForTeamB(View view) {
        scoreFootballTeamB = scoreFootballTeamB + 1;
        displayForTeamB(scoreFootballTeamB);
    }


    public void addOneFoulForTeamB(View view) {
        foulFootballTeamB = foulFootballTeamB + 1;
        displayFoulForTeamB(foulFootballTeamB);
    }


    //  private void display (int number) {
    //      TextView scorePointTextView = (TextView) findViewById (R.id.team_a_score);
    //      scorePointTextView.setText("" + number);
    //   }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreFootballTeamA = 0;
        scoreFootballTeamB = 0;
        foulFootballTeamA = 0;
        foulFootballTeamB = 0;
        displayForTeamA(scoreFootballTeamA);
        displayForTeamB(scoreFootballTeamA);
        displayFoulForTeamA(foulFootballTeamA);
        displayFoulForTeamB(foulFootballTeamB);
    }
}

