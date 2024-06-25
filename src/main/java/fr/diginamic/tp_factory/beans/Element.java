package fr.diginamic.tp_factory.beans;

import fr.diginamic.tp_factory.enums.Unite;


/** Element de la composition d'un produit alimentaire :
 * nom : nom de l'élément
 * valeur : valeur de l'élément
 * unite : unité de mesure de l'élément
 *
 * @see Element
 */
public abstract class Element {
    private String nom;
    private double valeur;
    private Unite unite;

    public Element(String nom, double valeur, Unite unite) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }


    @Override
    public String toString() {
        return "Element{" +
                "nom='" + nom + '\'' +
                ", valeur=" + valeur +
                ", unite=" + unite +
                '}';
    }
}
