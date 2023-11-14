package dz.Biskra.Info.exo1;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String specialite;
    private String adresse;
    private List<Etudiant> etudiantsInscrits;

    // Constructor
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    // Méthode pour inscrire un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Méthode pour désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }

    // Méthode pour afficher les informations du département
    @Override
    public String toString() {
        return "Département{" +
               "specialite='" + specialite + '\'' +
               ", adresse='" + adresse + '\'' +
               ", etudiantsInscrits=" + etudiantsInscrits +
               '}';
    }
}
