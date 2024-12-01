package tn.tuniprod.gestionmagasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;
    private int capacite;
    private List<Produit> produits;
    private List<Employe> employes;

    // Constructeur
    public Magasin(int identifiant, String nom, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    // Getter et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    // Ajouter un produit dans le magasin
    public void ajouterProduit(Produit produit) {
        if (produits.size() < capacite) {
            if (chercherProduit(produit) == -1) {
                produits.add(produit);
                System.out.println("Produit ajouté : " + produit.getDesignation());
            } else {
                System.out.println("Produit déjà présent dans le magasin.");
            }
        } else {
            System.out.println("Le magasin est plein, impossible d'ajouter le produit.");
        }
    }

    // Chercher un produit par code
    private int chercherProduit(Produit produit) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getCode() == produit.getCode()) {
                return i;
            }
        }
        return -1;
    }

    // Ajouter un employé dans le magasin
    public void ajouterEmploye(Employe employe) {
        if (employes.size() < 20) {  // Maximum 20 employés par magasin
            employes.add(employe);
            System.out.println("Employé ajouté : " + employe.getNom());
        } else {
            System.out.println("Le magasin a atteint le nombre maximal d'employés.");
        }
    }

    // Afficher les informations du magasin (produits et employés)
    public void afficherMagasin() {
        System.out.println("Magasin : " + nom + " (ID: " + identifiant + ")");
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacité maximale : " + capacite);
        System.out.println("\nProduits disponibles :");
        if (produits.isEmpty()) {
            System.out.println("Aucun produit disponible.");
        } else {
            for (Produit produit : produits) {
                produit.afficher();
            }
        }

        System.out.println("\nEmployés du magasin :");
        if (employes.isEmpty()) {
            System.out.println("Aucun employé dans ce magasin.");
        } else {
            for (Employe employe : employes) {
                System.out.println(employe);
            }
        }
    }

    // Calculer et afficher les salaires des employés
    public void afficherSalaires() {
        System.out.println("\nSalaires des employés :");
        for (Employe employe : employes) {
            double salaire = employe.calculerSalaire();
            System.out.println(employe.getNom() + " : " + salaire + " DT");
        }
    }

    // Afficher le magasin avec le plus grand nombre de produits
    public static void afficherMagasinPlus(Magasin mg1, Magasin mg2) {
        if (mg1.produits.size() > mg2.produits.size()) {
            mg1.afficherMagasin();
        } else if (mg2.produits.size() > mg1.produits.size()) {
            mg2.afficherMagasin();
        } else {
            System.out.println("Les deux magasins ont le même nombre de produits.");
        }
    }
}