package tn.tuniprod.gestionmagasin;

import java.util.Date;

public class Produit {
    private int code;
    private String designation;
    private String marque;
    private double prix;
    private Date date_exp;

    // Constructeur
    public Produit(int code, String designation, String marque, double prix) {
        this.code = code;
        this.designation = designation;
        this.marque = marque;
        this.prix = prix;
        this.date_exp = date_exp;
    }

    // Getter et Setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    // Méthode pour afficher les informations d'un produit
    public void afficher() {
        System.out.println("Code: " + code);
        System.out.println("Désignation: " + designation);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix + " DT");
        if (date_exp != null) {
            System.out.println("Date d'expiration: " + date_exp);
        } else {
            System.out.println("Date d'expiration: Pas définie");
        }
    }

    // Méthode de comparaison
    public static boolean comparer(Produit p1, Produit p2) {
        return p1.code == p2.code &&
                p1.designation.equals(p2.designation) &&
                p1.marque.equals(p2.marque) &&
                p1.prix == p2.prix &&
                (p1.date_exp == null ? p2.date_exp == null : p1.date_exp.equals(p2.date_exp));
    }

    @Override
    public String toString() {
        return "Produit [Code=" + code + ", Désignation=" + designation + ", Marque=" + marque + ", Prix=" + prix + "]";
    }
}
