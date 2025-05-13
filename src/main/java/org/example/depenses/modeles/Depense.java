package org.example.depenses.modeles;

import java.util.Date;


public class Depense {
    private String description;
    private double montant;
    private Date date;

    public Depense(String description, double montant, Date date) {
        this.description = description;
        this.montant = montant;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }
}
