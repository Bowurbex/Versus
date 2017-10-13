package com.example.jeromeconverset.versus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jeromeconverset.versus.model.Tournament;
import com.example.jeromeconverset.versus.model.TournamentDay;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public Tournament tournament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDatas();

        // ICI tu affiches un log avec le nom des 2 joueurs qui ont été ajouté au tournoi tourmanent
    }

    public void setDatas() {
        Date startDate = new Date();
        Date endDate = new Date();
        List<TournamentDay> tournamentDays = new ArrayList<>();

        TournamentDay dayOne = new TournamentDay();
        dayOne.setPlayerOne("J@y");
        dayOne.setPlayerTwo("BeuC");
        tournamentDays.add(dayOne);

        tournament = new Tournament(1, startDate, endDate);
        tournament.setTournamentDays(tournamentDays);
    }
}
