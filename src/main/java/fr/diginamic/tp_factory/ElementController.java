package fr.diginamic.tp_factory;

import fr.diginamic.tp_factory.beans.Additif;
import fr.diginamic.tp_factory.beans.Allergene;
import fr.diginamic.tp_factory.beans.Element;
import fr.diginamic.tp_factory.beans.Ingredient;
import fr.diginamic.tp_factory.enums.ElementType;
import fr.diginamic.tp_factory.enums.Unite;
import fr.diginamic.tp_factory.factory.ElementFactory;


/**
 * ElementController : Contrôleur pour les éléments
 *
 * @see Additif
 * @see Allergene
 * @see Ingredient
 * @see ElementType
 * @see Unite
 */
public class ElementController {


    /**
     * Constructeur
     */
    public ElementController() {
    }


    /**
     * Ajoute un élément grâce à la factory et le retourne en fonction du type d'élément passé en paramètre
     *
     * @param nom    nom de l'élément
     * @param valeur valeur de l'élément
     * @param unite  unité de l'élément
     * @param type   type de l'élément
     *
     * @return Element
     */
    public Element createElement(String nom, double valeur, Unite unite, ElementType type) {
        return ElementFactory.createElement(type, nom, valeur, unite);
    }
}
