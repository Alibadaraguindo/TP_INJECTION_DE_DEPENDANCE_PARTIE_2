package org.example.depenses.dao;

import org.example.depenses.modeles.Depense;
import java.util.ArrayList;
import java.util.List;




public class DepenseDao implements IDao {
    private List<Depense> depenses = new ArrayList<>();

    @Override
    public void ajouterDepense(Depense depense) {
        depenses.add(depense);
    }

    @Override
    public List<Depense> getAllDepenses() {
        return depenses;
    }
}
