package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // VARIABLE LIST
    int homePts = 0;   // Home team points
    int guestsPts = 0; // Guest team points

    /**
     * FUNCTION - onCreate
     *
     * Load saved instance state and set content view
     *
     * @param savedInstanceState - saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * FUNCTION - homeTouchDownPts
     *
     * Add and display 6 points for the touch down to the home team
     *
     * @param view - view that uses this method
     */
    public void homeTouchDownPts(View view) {
        homePts += 6;
        displayHomeScore();
    }

    /**
     * FUNCTION - homeExtraPoint
     *
     * Add and display an extra point to the home team
     *
     * @param view - view that uses this method
     */
    public void homeExtraPoint(View view) {
        homePts += 1;
        displayHomeScore();
    }

    /**
     * FUNCTION - homeFieldGoalPts
     *
     * Add and display 3 points for the field goal to the home team
     *
     * @param view - view that uses this method
     */
    public void homeFieldGoalPts(View view) {
        homePts += 3;
        displayHomeScore();
    }

    /**
     * FUNCTION - homeConvSafetyPts
     *
     * Add and display 2 points for the conversion/safety to the home team
     *
     * @param view - view that uses this method
     */
    public void homeConvSafetyPts(View view) {
        homePts += 2;
        displayHomeScore();
    }

    /**
     * FUNCTION - guestsTouchDownPts
     *
     * Add and display 6 points for the touch down to the guests team
     *
     * @param view - view that uses this method
     */
    public void guestsTouchDownPts(View view) {
        guestsPts += 6;
        displayGuestsScore();
    }

    /**
     * FUNCTION - guestsExtraPoint
     *
     * Add and display an extra point to the guests team
     *
     * @param view - view that uses this method
     */
    public void guestsExtraPoint(View view) {
        guestsPts += 1;
        displayGuestsScore();
    }

    /**
     * FUNCTION - guestsFieldGoalsPts
     *
     * Add and display 3 points for the field goal to the guests team
     *
     * @param view - view that uses this method
     */
    public void guestsFieldGoalsPts(View view) {
        guestsPts += 3;
        displayGuestsScore();
    }

    /**
     * FUNCTION - guestsConvSafetyPts
     *
     * Add and display 2 points for the conversion/safety to the home team
     *
     * @param view - view that uses this method
     */
    public void guestsConvSafetyPts(View view) {
        guestsPts += 2;
        displayGuestsScore();
    }

    /**
     * FUNCTION - reset
     *
     * Reset and display points for both teams
     *
     * @param view - view that uses this method
     */
    public void reset(View view) {
        homePts = 0;
        guestsPts = 0;
        displayHomeScore();
        displayGuestsScore();
    }

    /**
     * FUNCTION - displayHomeScore
     *
     * Display home team score
     */
    public void displayHomeScore() {
        TextView scoreView = findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(homePts));
    }

    /**
     * FUNCTION - displayGuestsScore
     *
     * Display guests team score
     */
    public void displayGuestsScore() {
        TextView scoreView = findViewById(R.id.guests_team_score);
        scoreView.setText(String.valueOf(guestsPts));
    }
}
