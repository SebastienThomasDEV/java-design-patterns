package fr.diginamic.tp_grasps;

import fr.diginamic.tp_factory.beans.Additif;
import fr.diginamic.tp_factory.beans.Allergene;
import fr.diginamic.tp_factory.beans.Element;
import fr.diginamic.tp_factory.beans.Ingredient;
import fr.diginamic.tp_factory.enums.ElementType;
import fr.diginamic.tp_factory.enums.Unite;
import fr.diginamic.tp_factory.factory.ElementFactory;
import org.junit.Test;


import static org.junit.Assert.*;

public class ElementControllerTest {

    /** DELTA */
    private static final double DELTA = 0.0000001;
    @Test
    public void testCreateIngredient() {
        Element ingredient = ElementFactory.createElement(ElementType.INGREDIENT, "Sucre", 100.0, Unite.MILLI_GRAMMES);
        assertTrue(ingredient instanceof Ingredient);
        assertEquals("Sucre", ingredient.getNom(), "Sucre");
        assertEquals(100.0, ingredient.getValeur(), DELTA);
        assertEquals(Unite.MILLI_GRAMMES, ingredient.getUnite());
    }

    @Test
    public void testCreateAdditif() {
        Element additif = ElementFactory.createElement(ElementType.ADDITIF, "Colorant", 5.0, Unite.MILLI_GRAMMES);
        assertTrue(additif instanceof Additif);
        assertEquals("Colorant", additif.getNom());
        assertEquals(5.0, additif.getValeur(), DELTA);
        assertEquals(Unite.MILLI_GRAMMES, additif.getUnite());
    }

    @Test
    public void testCreateAllergene() {
        Element allergene = ElementFactory.createElement(ElementType.ALLERGENE, "Arachides", 1.0, Unite.MILLI_GRAMMES);
        assertTrue(allergene instanceof Allergene);
        assertEquals("Arachides", allergene.getNom());
        assertEquals(1.0, allergene.getValeur(), DELTA);
        assertEquals(Unite.MILLI_GRAMMES, allergene.getUnite());
    }
}
