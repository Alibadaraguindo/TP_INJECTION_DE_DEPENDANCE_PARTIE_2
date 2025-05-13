package org.example;

import org.example.depenses.dao.DepenseDao;
import org.example.depenses.modeles.Depense;
import org.example.depenses.service.GestionDepensesService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création de l'objet DAO
        DepenseDao depenseDao = new DepenseDao();

        // Création du service métier avec l'injection de dépendance
        GestionDepensesService service = new GestionDepensesService(depenseDao);

        // Ajout des dépenses
        service.ajouterDepense(new Depense("Achat de nourriture", 50.0, new Date()));
        service.ajouterDepense(new Depense("Transport", 20.0, new Date()));

        // Affichage du total des dépenses
        System.out.println("Total des dépenses : " + service.calculerTotalDepenses());
    }
}
