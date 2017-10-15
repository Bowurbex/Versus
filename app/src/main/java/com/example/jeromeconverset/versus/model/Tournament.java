package com.example.jeromeconverset.versus.model;

import java.util.Date;
import java.util.List;

/**
 * Created by jeromeconverset on 12/10/2017.
 */

public class Tournament {

    public int tournamentId;
    public Date startDate;
    public String player;
    public List<TournamentDay> tournamentDays;
    public int tournamentLenght;


    public String getPlayer() {return player;}

    public void setPlayer(String player) {this.player = player;}

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

    public List<TournamentDay> getTournamentDays() {
        return tournamentDays;
    }

    public void setTournamentDays(List<TournamentDay> tournamentDays) {this.tournamentDays = tournamentDays;}

    public int getLenghttournament() {return tournamentLenght;}

    public void setLenghttournament(int lenghttournament) {this.tournamentLenght = lenghttournament;}
}
