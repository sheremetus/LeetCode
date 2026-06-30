package Patterns.Factory.factory;

import Patterns.Factory.buttons.Button;
import Patterns.Factory.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}