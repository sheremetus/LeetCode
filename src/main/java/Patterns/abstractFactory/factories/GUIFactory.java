package Patterns.abstractFactory.factories;

import Patterns.abstractFactory.entities.Button;
import Patterns.abstractFactory.entities.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}