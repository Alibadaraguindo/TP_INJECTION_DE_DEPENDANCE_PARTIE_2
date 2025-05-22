# GUINDO BADARA ALIOU 2100000017 MASTER SDIA FSM




# TP Injection de Dépendances - Partie 2 : Gestion des Dépenses

Le but de ce projet est de réaliser un système simple de gestion des dépenses d'une personne en utilisant l'injection de dépendances. L'objectif est d'ajouter des dépenses, de calculer le total des dépenses et de gérer ces opérations via une architecture propre où l'injection de dépendances est utilisée pour séparer les responsabilités du projet.
## Structure du projet

Le projet est structuré comme suit :

TP_INJECTION_DE_DEPENDANCE_PARTIE_2/
├── src/
│ ├── org/example/depenses/
│ │ ├── dao/
│ │ │ ├── IDao.java
│ │ │ ├── DepenseDao.java
│ │ ├── service/
│ │ │ ├── IMetier.java
│ │ │ ├── GestionDepensesService.java
│ │ ├── modeles/
│ │ │ ├── Depense.java
│ └── Main.java

# Description des fichiers**

- **`IDao.java`** : Interface définissant les méthodes pour l'accès aux données des dépenses.
- **`DepenseDao.java`** : Implémentation de l'interface `IDao` pour gérer les dépenses en mémoire.
- **`IMetier.java`** : Interface définissant les méthodes métier pour la gestion des dépenses.
- **`GestionDepensesService.java`** : Implémentation de l'interface `IMetier` pour gérer les dépenses via la logique métier.
- **`Depense.java`** : Classe modèle représentant une dépense avec une description, un montant, et une date.
- **`Main.java`** : Classe principale contenant la méthode `main` pour tester le projet.



![image](https://github.com/user-attachments/assets/e3fecf8f-4355-46d8-a4e0-a32c03af289e)
![image](https://github.com/user-attachments/assets/b7bc471e-cc7a-4981-947b-f22272fffb0b)
![image](https://github.com/user-attachments/assets/f6837805-788a-4bd0-8332-93e039d37011)

### Fonctionnalités

- **Ajouter une dépense** : Le projet permet d'ajouter une dépense avec une description, un montant et une date.
- **Calculer le total des dépenses** : Le projet calcule le total de toutes les dépenses ajoutées en sommant leurs montants.

Les dépenses sont ajoutées via la méthode `ajouterDepense` et le total est calculé via `calculerTotalDepenses`.



  ## Conclusion

Ce projet permet de comprendre l'application de l'injection de dépendances dans une application Java simple. L'utilisation de concepts comme l'interface `IDao` et `IMetier` permet de séparer clairement la gestion des données et la logique métier, rendant le code modulaire et facile à maintenir.

