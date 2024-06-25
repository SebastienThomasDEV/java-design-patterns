package fr.diginamic.tp_builder.beans;

public class Additif {
    private final String nom;
    private final double qteMilligrammes;

    public Additif(String nom, double qteMilligrammes) {
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
        return "Additif{" +
                "nom='" + nom +
                ", qteMilligrammes=" + qteMilligrammes +
                '}';
    }
}
