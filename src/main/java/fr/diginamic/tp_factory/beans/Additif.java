package fr.diginamic.tp_factory.beans;

import fr.diginamic.tp_factory.enums.ElementType;
import fr.diginamic.tp_factory.enums.Unite;

/**
 * Additif
 *
 * @see ElementType
 * @see Unite
 */
public class Additif extends Element {
    public Additif(String nom, double valeur, Unite unite) {
        super(nom, valeur, unite);
    }
}