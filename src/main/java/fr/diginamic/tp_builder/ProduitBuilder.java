package fr.diginamic.tp_builder;

import fr.diginamic.tp_builder.beans.*;

import java.util.List;

public class ProduitBuilder {
    private String nom;

    private String grade;
    private Categorie categorie;

    private Marque marque;

    private List<Ingredient> ingredients;

    private List<Additif> additifs;

    private List<Allergene> allergenes;

    public ProduitBuilder addCategorie(Categorie categorie) {
        if (categorie == null) throw new IllegalArgumentException("La catégorie ne peut pas être nulle");
        if (categorie.getNom() == null) throw new IllegalArgumentException("Le nom de la catégorie ne peut pas être null");
        if (categorie.getNom().isEmpty()) throw new IllegalArgumentException("Le nom de la catégorie ne peut pas être vide");
        this.categorie = categorie;
        return this;
    }

    public ProduitBuilder addMarque(Marque marque) {
        if (marque == null) throw new IllegalArgumentException("La marque ne peut pas être nulle");
        if (marque.getNom() == null) throw new IllegalArgumentException("Le nom de la marque ne peut pas être null");
        if (marque.getNom().isEmpty()) throw new IllegalArgumentException("Le nom de la marque ne peut pas être vide");
        this.marque = marque;
        return this;
    }

    public ProduitBuilder addIngredient(String nom, double qteGrammes) {
        if (nom == null) throw new IllegalArgumentException("Le nom de l'ingrédient ne peut pas être null");
        if (nom.isEmpty()) throw new IllegalArgumentException("Le nom de l'ingrédient ne peut pas être vide");
        if (qteGrammes <= 0) throw new IllegalArgumentException("La quantité de l'ingrédient doit être supérieure à 0");
        this.ingredients.add(new Ingredient(nom, qteGrammes));
        return this;
    }

    public ProduitBuilder addAdditif(String nom, double qteMilligrammes) {
        if (nom == null) throw new IllegalArgumentException("Le nom de l'additif ne peut pas être null");
        if (nom.isEmpty()) throw new IllegalArgumentException("Le nom de l'additif ne peut pas être vide");
        if (qteMilligrammes <= 0) throw new IllegalArgumentException("La quantité de l'additif doit être supérieure à 0");
        this.additifs.add(new Additif(nom, qteMilligrammes));
        return this;
    }

    public ProduitBuilder addAllergene(String nom, double qteMilligrammes) {
        if (nom == null) throw new IllegalArgumentException("Le nom de l'allergène ne peut pas être null");
        if (nom.isEmpty()) throw new IllegalArgumentException("Le nom de l'allergène ne peut pas être vide");
        if (qteMilligrammes <= 0) throw new IllegalArgumentException("La quantité de l'allergène doit être supérieure à 0");
        this.allergenes.add(new Allergene(nom, qteMilligrammes));
        return this;
    }


    @Override
    public String toString() {
        return "ProduitBuilder{" +
                "nom='" + nom + '\'' +
                ", grade='" + grade + '\'' +
                ", categorie=" + categorie +
                ", marque=" + marque +
                ", ingredients=" + ingredients +
                ", additifs=" + additifs +
                ", allergenes=" + allergenes +
                '}';
    }


    public ProduitBuilder(String nom, String grade) {
        this.nom = nom;
        this.grade = grade;
    }
    public Produit build() {
        return new Produit(nom, grade, categorie, marque, ingredients, additifs, allergenes);
    }
}