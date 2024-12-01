package tn.tuniprod.gestionmagasin;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    // Constructeur
    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    // Méthode pour calculer le salaire d'un caissier
    @Override
    public double calculerSalaire() {
        double salaire = 0;
        // Salaire normal
        if (getNbr_heures() <= 180) {
            salaire = getNbr_heures() * 5;  // 5DT par heure
        } else {
            // Salaire avec heures supplémentaires
            salaire = (180 * 5) + ((getNbr_heures() - 180) * 5 * 1.15);  // 15% en plus pour les heures supplémentaires
        }
        return salaire;
    }

    // Getter et Setter
    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caisse ID=" + numeroDeCaisse;
    }
}