package patterns.abstractFactory.factories;

import patterns.abstractFactory.entities.Button;
import patterns.abstractFactory.entities.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}