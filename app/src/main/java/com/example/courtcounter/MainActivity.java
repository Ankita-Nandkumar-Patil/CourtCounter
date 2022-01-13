package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamA(scoreTeamA);

    }
    // team A work -
    public void addThreeForTeamA(View V){   //add 3 when +3 points button pressed
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View V){         //add 3 when +2 points button pressed
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View V){         //add 3 when free throw button pressed
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }


    // team B work -
    public void addThreeForTeamB(View V){   //add 3 when +3 points button pressed
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View V) {   //add 3 when +2 points button pressed
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View V) {   //add 3 when FRee Throw points button pressed
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    // RESET both team's score to 0
    public void resetScore(View V){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        //scores must be updated first and then we should display it.!

    }



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
}