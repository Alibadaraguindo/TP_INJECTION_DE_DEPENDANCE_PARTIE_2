package org.example.depenses.service;

import org.example.depenses.dao.IDao;
import org.example.depenses.modeles.Depense;

public class GestionDepensesService implements IMetier {
    private IDao depenseDao;

    // Injection de dépendance via le constructeur
    public GestionDepensesService(IDao depenseDao) {
        this.depenseDao = depenseDao;
    }

    @Override
    public void ajouterDepense(Depense depense) {
        depenseDao.ajouterDepense(depense);
    }

    @Override
    public double calculerTotalDepenses() {
        return depenseDao.getAllDepenses().stream()
                .mapToDouble(Depense::getMontant)
                .sum();
    }
}
