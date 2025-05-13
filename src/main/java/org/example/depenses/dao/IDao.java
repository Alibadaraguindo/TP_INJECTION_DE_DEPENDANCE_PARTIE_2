package org.example.depenses.dao;

import org.example.depenses.modeles.Depense;
import java.util.List;


public interface IDao {
    void ajouterDepense(Depense depense);
    List<Depense> getAllDepenses();
}
