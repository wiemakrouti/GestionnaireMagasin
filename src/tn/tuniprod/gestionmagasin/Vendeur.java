package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employe {
    private double tauxDeVente;  // Taux de vente en pourcentage

    // Constructeur
    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    // Méthode pour calculer le salaire d'un vendeur
    @Override
    public double calculerSalaire() {
        double salaire = 450 * tauxDeVente;  // Salaire fixe multiplié par le taux de vente
        return salaire;
    }

    // Getter et Setter
    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de vente=" + tauxDeVente;
    }
}