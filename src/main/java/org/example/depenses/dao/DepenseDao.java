package org.example.depenses.dao;


import org.example.depenses.modeles.Depense;
import java.util.ArrayList;
import java.util.List;

public class DepenseDao {
    private List<Depense> depenses = new ArrayList<>();

    public void ajouterDepense(Depense depense) {
        depenses.add(depense);
    }

    public List<Depense> getAllDepenses() {
        return depenses;
    }
}
