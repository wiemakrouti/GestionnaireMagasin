package tn.tuniprod.gestionmagasin;

public abstract class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbr_heures;  // Nombre d'heures par mois

    // Constructeur
    public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    // Méthode abstraite pour calculer le salaire
    public abstract double calculerSalaire();

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    @Override
    public String toString() {
        return "Employé [ID=" + identifiant + ", Nom=" + nom + ", Adresse=" + adresse + ", Heures=" + nbr_heures + "]";
    }
}