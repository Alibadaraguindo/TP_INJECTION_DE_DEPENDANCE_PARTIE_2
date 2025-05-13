package org.example.depenses.modeles;

import java.util.Date;

public class Depense {
    private double montant;
    private String description;
    private Date date;

    // Constructeurs, getters et setters

    public Depense(double montant, String description, Date date) {
        this.montant = montant;
        this.description = description;
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}