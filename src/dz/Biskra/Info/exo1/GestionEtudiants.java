package dz.Biskra.Info.exo1;


import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        // Création de l'objet Etudiant lolo
        Etudiant lolo = new Etudiant("Lolo", "PrenomLolo", LocalDate.of(2000, Month.JANUARY, 1),
                "lolo@example.com", "123 Rue Lolo");

        // Affichage des informations de lolo
        System.out.println("Informations de lolo:");
        System.out.println(lolo);

        // Création de l'objet Etudiant toto
        Etudiant toto = new Etudiant("Lolo", "PrenomLolo", LocalDate.of(2000, Month.JANUARY, 1),
                "lolo@example.com", "123 Rue Lolo");

        // Comparaison des deux objets avec l'opérateur ==
        System.out.println("lolo == toto ? " + (lolo == toto)); // Cela devrait afficher false

        // Modification du nom de toto (qui devrait être un surnom de lolo)
        toto.setNom("Toto");

        // Vérification que la modification se répercute sur lolo
        System.out.println("Après modification de toto, lolo :");
        System.out.println(lolo);
        // Création de nouveaux étudiants
        Etudiant fifi = new Etudiant("Fifi", "PrenomFifi", LocalDate.of(2001, Month.MARCH, 15),
                "fifi@example.com", "456 Rue Fifi");

        Etudiant riri = new Etudiant("Riri", "PrenomRiri", LocalDate.of(2002, Month.APRIL, 20),
                "riri@example.com", "789 Rue Riri");

        // Création d'un nouveau département
        Departement monDepInfo = new Departement("Informatique", "123 Rue Info");

        // Inscription des étudiants dans le département
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

        // Affichage des informations du département
        System.out.println("Informations du département après inscription :");
        System.out.println(monDepInfo);

        // Désinscription de toto du département
        monDepInfo.desinscrire(toto);

        // Affichage des informations du département après désinscription
        System.out.println("Informations du département après désinscription de toto :");
        System.out.println(monDepInfo);

    }
}
