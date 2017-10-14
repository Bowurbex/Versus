package com.example.jeromeconverset.versus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.jeromeconverset.versus.model.Tournament;
import com.example.jeromeconverset.versus.model.TournamentDay;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Déclaration de la variable de Class tournament
    // cette variable est accessible depuis partout dans cette class
    public Tournament tournament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on appelle la fonction définie plus bas
        // cela va initialiser l'objet tournament avec un match auquel participe J@y et BeuC
        setDatas();

        // ICI tu affiches un log avec le nom des 2 joueurs qui ont été ajouté au tournoi tourmanent
        // il faut que tu lises la variable tournamentDays de l'objet tournament et que tu y récupères
        // le nom des 2 joueurs
        // et que tu affiches cela dans un log
        // Voici un exemple pour t'aider. Bienvenue dans la POO (Programmation Orientée Objets)
        Log.d("Exercice1", "J'affiche l'identifiant du tournoi" + tournament.getTournamentId());

    }

    public void setDatas() {
        Date startDate = new Date();
        Date endDate = new Date();

        // On créé ici un match appelé dayOne (tu m'as dis qu'un match était une journée
        // de tournoi
        TournamentDay dayOne = new TournamentDay();
        // pour ce match on initialise le nom des joueurs
        dayOne.setPlayerOne("J@y");
        dayOne.setPlayerTwo("BeuC");

        // ici on créé une liste de matchs
        List<TournamentDay> tournamentDays = new ArrayList<>();
        // et on lui affecte le match dayOne
        tournamentDays.add(dayOne);

        // Ici on initialise la variable tournament avec un objet de type Tournament
        // qui prend en paramètre d'initialisation
        // l'id du tournoi : 1
        // la date de début: date du jour
        // la date de fin : date du jour
        tournament = new Tournament(1, startDate, endDate);
        // On affecte à notre objet tournament la liste de matchs qu'on a déclaré et initialisé
        // plus haut
        tournament.setTournamentDays(tournamentDays);
    }
}
