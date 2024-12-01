package tn.tuniprod.gestionmagasin;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireMagasin {

    private List<Magasin> magasins;

    // Constructeur de la classe GestionnaireMagasin
    public GestionnaireMagasin() {
        this.magasins = new ArrayList<>();
    }

    // Méthode pour ajouter un magasin à la liste
    public void ajouterMagasin(Magasin mg) {
        magasins.add(mg);
    }

    // Méthode pour obtenir le nombre total de produits dans tous les magasins
    public int getNbrTProd() {
        int totalProduits = 0;
        // Parcours de la liste des magasins et addition du nombre de produits dans chaque magasin
        for (Magasin magasin : magasins) {
            totalProduits += magasin.getProduits().size();
        }
        return totalProduits;
    }

    // Méthode pour afficher les magasins et leurs informations
    public void afficherMagasins() {
        for (Magasin magasin : magasins) {
            magasin.afficherMagasin();
        }
    }
}