package patterns.abstractFactory.factories;

import patterns.abstractFactory.entities.Button;
import patterns.abstractFactory.entities.Checkbox;
import patterns.abstractFactory.entities.MacOSButton;
import patterns.abstractFactory.entities.MacOSCheckbox;

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