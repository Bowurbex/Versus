package com.example.jeromeconverset.versus.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jeromeconverset on 12/10/2017.
 */

public class Tournament {

    private int tournamentId;
    private int numberOfTournamentDays;
    private Date startDate;
    private Date endDate;
    private Player playerOne;
    private Player playerTwo;
    private List<TournamentDay> tournamentDays = new ArrayList<>();

    public Tournament(int numberOfTournamentDays) {
        this.numberOfTournamentDays = numberOfTournamentDays;
        addTournamentDay();
    }

    public Tournament(int numberOfTournamentDays, Player playerOne, Player playerTwo) {
        this.numberOfTournamentDays = numberOfTournamentDays;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        addTournamentDay();
    }

    /**
     * Add a new tournament day to the tournament
     */
    public void addTournamentDay() {
        int tournamentDayId = 1;

        if(!tournamentDays.isEmpty()) {
            tournamentDayId = tournamentDays.size() + 1;
        }

        // TODO: return an exception if someone tries to add more tournament day than expected by
        // the variable numberOfTournamentDays

        tournamentDays.add(new TournamentDay(tournamentDayId));
    }

    /**
     * This function return the current (last) tournament day
     * @return  TournamentDay: the current tournament day of the tournament
     */
    public TournamentDay getCurrentTournamentDay() {
        TournamentDay currentTournamentDay = null;

        if(!tournamentDays.isEmpty()) {
            currentTournamentDay = tournamentDays.get(tournamentDays.size() - 1);
        }

        return currentTournamentDay;
    }

    /**
     *
     * @return  boolean
     *          true if the tournament is over according to the number of tournament days
     *          false if all tournament days are not set
     */
    public boolean isTournamentOver() {
        int tournamentDaysSize = tournamentDays.size();
        return tournamentDaysSize == numberOfTournamentDays
                    && tournamentDays.get(tournamentDaysSize -1).isTournamentDayOver();
    }

    public int getNumberOfTournamentDays() {
        return numberOfTournamentDays;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public List<TournamentDay> getTournamentDays() {
        return tournamentDays;
    }

    public void setTournamentDays(List<TournamentDay> tournamentDays) {
        this.tournamentDays = tournamentDays;
    }
}
