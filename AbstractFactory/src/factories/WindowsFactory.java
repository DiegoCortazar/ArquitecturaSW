package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;
import radios.Radio;
import radios.WindowsRadio;
import scrolls.Scroll;
import scrolls.WindowsScroll;

/**
 * Cada fábrica concreta extiende de la fábrica abstracta y es responsable de
 * crear los productos de una variedad específica.
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

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }

    @Override
    public Radio createRadio() {
        return new WindowsRadio();
    }

}
