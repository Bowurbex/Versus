package com.example.jeromeconverset.versus;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeromeconverset.versus.model.Player;
import com.example.jeromeconverset.versus.model.Tournament;


public class MainActivity extends AppCompatActivity {
    public Tournament tournament;
    public TextView textViewContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewContent = (TextView) findViewById(R.id.tv_content);
        Button buttonStartTournament = (Button) findViewById(R.id.btn_start_tournament);

        buttonStartTournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTournament();

                textViewContent.setText(
                        String.format(getResources().getString(R.string.tournament_day_title),
                                tournament.getCurrentTournamentDay().getTournamentDayId(),
                                tournament.getPlayerOne().getPrenom(),
                                tournament.getPlayerTwo().getPrenom()));

                Snackbar.make(v, "CONGRATS you start the tournament", Snackbar.LENGTH_LONG).show();
            }
        });


    }

    public void startTournament() {
        Player playerOne = new Player("Jérôme", "C");
        Player playerTwo = new Player("Sébastien", "B");
        tournament = new Tournament(20, playerOne, playerTwo);
    }
}
