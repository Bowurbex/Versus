package com.example.jeromeconverset.versus.model;

import java.util.Date;
import java.util.List;

/**
 * Created by jeromeconverset on 12/10/2017.
 */

public class Tournament {

    public int tournamentId;
    public Date startDate;
    public String playerOne;
    public String playerTwo;
    public List<TournamentDay> tournamentDays;

    // créer une variable 20 ou 40 pour déterminer nombre matchs tournoi
    public enum tournamentLenght{}

        public int getTournamentLenght1() {
            return tournamentLenght1;
        }

        public int getTournamentLenght2() {
            return tournamentLenght2;
        }

        private int tournamentLenght1 = 20,
        private int tournamentLenght2 = 40;



    public Tournament(int tournamentId, Date startDate, Date endDate) {
        this.tournamentId = tournamentId;
        this.startDate = startDate;

    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPlayer() {return playerOne;}

    public void setPlayer(String player) {this.playerOne = player;}

    public String getPlayerTwo() {return playerTwo;}

    public void setPlayerTwo(String playerTwo) {this.playerTwo = playerTwo;}

    public List<TournamentDay> getTournamentDays() {
        return tournamentDays;
    }

    public void setTournamentDays(List<TournamentDay> tournamentDays) {this.tournamentDays = tournamentDays;}

    public int getLenghttournament() {return tournamentLenght;}

    public void setLenghttournament(int lenghttournament) {this.tournamentLenght = lenghttournament;}
}
