package patterns.abstractFactory.factories;

import patterns.abstractFactory.entities.Button;
import patterns.abstractFactory.entities.Checkbox;
import patterns.abstractFactory.entities.WindowsButton;
import patterns.abstractFactory.entities.WindowsCheckbox;

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
