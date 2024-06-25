package fr.diginamic.tp_factory;

import fr.diginamic.tp_factory.beans.Element;
import fr.diginamic.tp_factory.enums.ElementType;
import fr.diginamic.tp_factory.enums.Unite;

public class Main {

    public static void main(String[] args) {
        ElementController elementController = new ElementController();
        Element element = elementController.createElement("XXX", 10, Unite.MICRO_GRAMMES, ElementType.ADDITIF);
        System.out.println(element);
    }
}
