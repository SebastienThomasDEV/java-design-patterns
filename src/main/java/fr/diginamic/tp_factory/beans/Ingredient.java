package fr.diginamic.tp_factory.beans;

import fr.diginamic.tp_factory.enums.Unite;


/** Ingredient
 *
 * @see Element
 * @see Unite
 */
public class Ingredient extends Element {
    public Ingredient(String nom, double valeur, Unite unite) {
        super(nom, valeur, unite);
    }
}