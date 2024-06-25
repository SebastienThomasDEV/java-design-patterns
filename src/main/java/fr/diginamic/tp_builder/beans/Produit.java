package fr.diginamic.tp_builder.beans;

import java.util.List;

public class Produit {
    private final String nom;
    private final String grade;
    private final Categorie categorie;
    private final Marque marque;
    private final List<Ingredient> ingredients;
    private final List<Additif> additifs;
    private final List<Allergene> allergenes;

    public Produit(String nom, String grade, Categorie categorie, Marque marque, List<Ingredient> ingredients, List<Additif> additifs, List<Allergene> allergenes) {
        this.nom = nom;
        this.grade = grade;
        this.categorie = categorie;
        this.marque = marque;
        this.ingredients = ingredients;
        this.additifs = additifs;
        this.allergenes = allergenes;
    }


    // Getters and toString() methods
    public String getNom() {
        return nom;
    }

    public String getGrade() {
        return grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom +
                ", grade='" + grade +
                ", categorie=" + categorie +
                ", marque=" + marque +
                ", ingredients=" + ingredients +
                ", additifs=" + additifs +
                ", allergenes=" + allergenes +
                '}';
    }
}
