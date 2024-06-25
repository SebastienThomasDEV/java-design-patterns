package fr.diginamic.tp_builder.beans;

public class Allergene {
    private final String nom;
    private final double qteMilligrammes;

    public Allergene(String nom, double qteMilligrammes) {
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
        return "Allergene{" +
                "nom='" + nom +
                ", qteMilligrammes=" + qteMilligrammes +
                '}';
    }
}
