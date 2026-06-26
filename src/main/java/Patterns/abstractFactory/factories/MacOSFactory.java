package Patterns.abstractFactory.factories;

import Patterns.abstractFactory.entities.Button;
import Patterns.abstractFactory.entities.Checkbox;
import Patterns.abstractFactory.entities.MacOSButton;
import Patterns.abstractFactory.entities.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}