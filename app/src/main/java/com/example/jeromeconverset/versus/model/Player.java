package com.example.jeromeconverset.versus.model;

/**
 * Created by focus404 on 15/10/2017.
 */

public class Player {
    public String firstName;
    public String lastName;

    public Player(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

