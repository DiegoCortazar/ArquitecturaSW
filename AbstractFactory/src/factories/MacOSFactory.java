package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;
import radios.MacOSRadio;
import radios.Radio;
import scrolls.MacOSScroll;
import scrolls.Scroll;

/**
 * Cada fábrica concreta extiende de la fábrica abstracta y es responsable de
 * crear los productos de una variedad específica.
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

    @Override
    public Scroll createScroll() {
        return new MacOSScroll();
    }

    @Override
    public Radio createRadio() {
        return new MacOSRadio();
    }
}
