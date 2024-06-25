package fr.diginamic.tp_builder.beans;

public class Marque {
    private final String nom;

    public Marque(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Marque{" +
                "nom='" + nom  +
                '}';
    }
}
