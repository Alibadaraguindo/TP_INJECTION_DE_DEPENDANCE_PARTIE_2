package org.example.depenses.service;

import org.example.depenses.modeles.Depense;


public interface IMetier {
    void ajouterDepense(Depense depense);
    double calculerTotalDepenses();
}
