package com.example.jeromeconverset.versus.model;

import java.util.Date;
import java.util.List;

/**
 * Created by jeromeconverset on 12/10/2017.
 */

public class Tournament {
    public int tournamentId;
    public Date startDate;
    public Date endDate;
    public List<TournamentDay> tournamentDays;

    public Tournament(int tournamentId, Date startDate, Date endDate) {
        this.tournamentId = tournamentId;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<TournamentDay> getTournamentDays() {
        return tournamentDays;
    }

    public void setTournamentDays(List<TournamentDay> tournamentDays) {
        this.tournamentDays = tournamentDays;
    }
}
