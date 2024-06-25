package fr.diginamic.tp_factory.factory;

import fr.diginamic.tp_factory.beans.Additif;
import fr.diginamic.tp_factory.beans.Allergene;
import fr.diginamic.tp_factory.beans.Element;
import fr.diginamic.tp_factory.beans.Ingredient;
import fr.diginamic.tp_factory.enums.ElementType;
import fr.diginamic.tp_factory.enums.Unite;

public class ElementFactory {

        public static Element createElement(ElementType type, String nom, double valeur, Unite unite) {
            switch (type) {
                case INGREDIENT:
                    return new Ingredient(nom, valeur, unite);
                case ADDITIF:
                    return new Additif(nom, valeur, unite);
                case ALLERGENE:
                    return new Allergene(nom, valeur, unite);
                default:
                    throw new IllegalArgumentException("Type d'élément inconnu : " + type);
            }
        }

}
