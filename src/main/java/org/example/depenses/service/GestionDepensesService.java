package org.example.depenses.service;

import org.example.depenses.dao.DepenseDao;
import org.example.depenses.modeles.Depense;

public class GestionDepensesService {
    private DepenseDao depenseDao;

    // Injection de dépendance via constructeur
    public GestionDepensesService(DepenseDao depenseDao) {
        this.depenseDao = depenseDao;
    }

    public void ajouterDepense(Depense depense) {
        depenseDao.ajouterDepense(depense);
    }

    public double calculerTotalDepenses() {
        double total = 0;
        for (Depense depense : depenseDao.getAllDepenses()) {
            total += depense.getMontant();
        }
        return total;
    }
}
