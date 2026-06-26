package Patterns.abstractFactory.factories;

import Patterns.abstractFactory.entities.Button;
import Patterns.abstractFactory.entities.Checkbox;
import Patterns.abstractFactory.entities.WindowsButton;
import Patterns.abstractFactory.entities.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
