package dz.Biskra.Info.exo1;

import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;

    // Constructor
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    // Méthode pour changer le nom
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Méthode pour afficher les informations de l'objet Etudiant
    @Override
    public String toString() {
        return "Etudiant{" +
               "nom='" + nom + '\'' +
               ", prenom='" + prenom + '\'' +
               ", dateNaissance=" + dateNaissance +
               ", adresseMail='" + adresseMail + '\'' +
               ", adressePostale='" + adressePostale + '\'' +
               '}';
    }
}
