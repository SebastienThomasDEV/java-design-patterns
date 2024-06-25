package fr.diginamic.tp_builder.beans;

public class Categorie {
    private final String nom;

    public Categorie(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom +
                '}';
    }
}
