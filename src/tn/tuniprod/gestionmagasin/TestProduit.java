package tn.tuniprod.gestionmagasin;

import java.util.Date;

public class TestProduit {
    public static void main(String[] args) {
        // Création de la date actuelle
        Date dateActuelle = new Date();

        // Création des produits
        Produit p1 = new Produit(101, "Lait", "Delice", 0.700);
        Produit p2 = new Produit(102, "Yaourt", "Vitalait", 0.500);
        Produit p3 = new Produit(103, "Tomates", "Sicam", 1.200);
        Produit p4 = new Produit(104, "Pain", "Pâtisserie", 1.100);
        Produit p5 = new Produit(105, "Beurre", "Brand X", 2.500);

        // Affichage des produits
        System.out.println("Affichage des produits :");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        p5.afficher();

        // Modification des produits
        System.out.println("\nModification des produits :");
        p2.setPrix(0.550); // Mise à jour du prix du Yaourt
        p2.setDate_exp(dateActuelle); // Mise à jour de la date d'expiration
        p2.afficher();

        p3.setPrix(1.150); // Mise à jour du prix des Tomates
        p3.setDate_exp(dateActuelle);
        p3.afficher();

        p4.setPrix(1.250); // Mise à jour du prix du Pain
        p4.setDate_exp(dateActuelle);
        p4.afficher();

        // Test de la méthode toString()
        System.out.println("\nUtilisation de la méthode toString() :");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        // Comparaison de produits
        System.out.println("\nComparaison de produits :");
        boolean comparResult = Produit.comparer(p1, p2);
        System.out.println("Les produits p1 et p2 sont-ils identiques ? " + comparResult);

        comparResult = Produit.comparer(p1, p3);
        System.out.println("Les produits p1 et p3 sont-ils identiques ? " + comparResult);

        // Création des magasins
        Magasin m1 = new Magasin(1, "Carrefour", "Centre-Ville", 10);
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6", 15);

        // Ajout des produits dans les magasins
        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);

        m2.ajouterProduit(p4);
        m2.ajouterProduit(p5);

        // Affichage des magasins
        System.out.println("\nAffichage des magasins et leurs produits :");
        m1.afficherMagasin();
        m2.afficherMagasin();

        // Création des employés
        Caissier caissier1 = new Caissier(1, "Ahmed", "Tunis", 180, 101);
        Vendeur vendeur1 = new Vendeur(2, "Sofia", "Tunis", 160, 0.1);
        Responsable responsable1 = new Responsable(3, "Karim", "Tunis", 160, 200);

        // Ajout des employés au magasin 1
        m1.ajouterEmploye(caissier1);
        m1.ajouterEmploye(vendeur1);
        m1.ajouterEmploye(responsable1);

        // Création d'autres employés pour le magasin 2
        Caissier caissier2 = new Caissier(4, "Sami", "Sfax", 190, 102);
        Vendeur vendeur2 = new Vendeur(5, "Leila", "Tunis", 165, 0.15);
        Vendeur vendeur3 = new Vendeur(6, "Nadia", "Tunis", 170, 0.2);
        Responsable responsable2 = new Responsable(7, "Tarek", "Tunis", 180, 250);

        // Ajout des employés au magasin 2
        m2.ajouterEmploye(caissier2);
        m2.ajouterEmploye(vendeur2);
        m2.ajouterEmploye(vendeur3);
        m2.ajouterEmploye(responsable2);

        // Affichage des salaires des employés des deux magasins
        System.out.println("\nAffichage des salaires des employés :");
        m1.afficherSalaires();
        m2.afficherSalaires();

        // Comparaison des magasins par nombre de produits
        Magasin.afficherMagasinPlus(m1, m2);
    }
}