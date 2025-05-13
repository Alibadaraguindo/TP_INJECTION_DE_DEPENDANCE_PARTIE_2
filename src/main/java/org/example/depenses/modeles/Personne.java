package org.example.depenses.modeles;

public class Personne {
    private String nom;
    private String prenom;
    private double solde;

    // Constructeurs, getters et setters

    public Personne(String nom, String prenom, double solde) {
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
