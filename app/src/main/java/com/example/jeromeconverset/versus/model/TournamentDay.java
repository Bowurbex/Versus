package com.example.jeromeconverset.versus.model;

import java.util.Date;

/**
 * Created by jeromeconverset on 12/10/2017.
 */

public class TournamentDay {
    private int tournamentDayId;
    private Date startDate;
    private Date endDate;
    private boolean isTournamentDayOver = false;

    public TournamentDay(int tournamentDayId) {
        this.tournamentDayId = tournamentDayId;
        this.startDate  = new Date();
    }

    public int getTournamentDayId() {
        return tournamentDayId;
    }

    /**
     * Defines if the tournament day is over because of one of the player won the game
     * @return boolean:
     *    true if the tournament day is over
     *    false otherwise
     */
    public boolean isTournamentDayOver() {
        // TODO implements the correct rule for this function
        return isTournamentDayOver;
    }

}
