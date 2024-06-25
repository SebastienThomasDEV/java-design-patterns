package fr.diginamic.tp_builder.beans;

public class Ingredient {
    private final String nom;
    private final double qteMilligrammes;

    public Ingredient(String nom, double qteMilligrammes) {
        this.nom = nom;
        this.qteMilligrammes = qteMilligrammes;
    }

    public String getNom() {
        return nom;
    }

    public double getQteMilligrammes() {
        return qteMilligrammes;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "nom='" + nom +
                ", qteMilligrammes=" + qteMilligrammes +
                '}';
    }
}
