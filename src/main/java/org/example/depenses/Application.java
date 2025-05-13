package org.example.depenses;

import org.example.depenses.dao.DepenseDao;
import org.example.depenses.modeles.Depense;
import org.example.depenses.service.GestionDepensesService;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        // Simulation de l'injection de dépendance
        DepenseDao depenseDao = new DepenseDao();
        GestionDepensesService gestionService = new GestionDepensesService(depenseDao);

        // Ajout de dépenses
        gestionService.ajouterDepense(new Depense(50.0, "Courses", new Date()));
        gestionService.ajouterDepense(new Depense(100.0, "Shopping", new Date()));

        // Affichage du total des dépenses
        System.out.println("Total des dépenses : " + gestionService.calculerTotalDepenses() + "€");
    }
}
