package com.example.jeromeconverset.versus.model;

/**
 * Created by focus404 on 15/10/2017.
 */

public class Player {

    public String prenom;
    public String nom;

    public Player(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
