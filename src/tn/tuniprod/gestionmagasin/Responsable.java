package tn.tuniprod.gestionmagasin;

public class Responsable extends Employe {
    private double prime;  // Prime mensuelle

    // Constructeur
    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    // Méthode pour calculer le salaire d'un responsable
    @Override
    public double calculerSalaire() {
        double salaire = 0;
        // Salaire normal
        if (getNbr_heures() <= 160) {
            salaire = getNbr_heures() * 10;  // 10DT par heure
        } else {
            // Salaire avec heures supplémentaires
            salaire = (160 * 10) + ((getNbr_heures() - 160) * 10 * 1.20);  // 20% en plus pour les heures supplémentaires
        }
        // Ajouter la prime
        salaire += prime;
        return salaire;
    }

    // Getter et Setter
    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime=" + prime;
    }
}