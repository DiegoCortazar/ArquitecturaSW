package app;

import buttons.Button;
import checkboxes.Checkbox;
import scrolls.Scroll;
import radios.Radio;
import factories.GUIFactory;

/**
 * Los usuarios de Factory escogen el tipo de fábrica y el tipo de componente
 * que desean crear mediante sus interfaces, pero no interactúan con fábricas
 * concretas.
 */
public class Application {

    private Button button;
    private Checkbox checkbox;
    private Scroll scroll;
    private Radio radio;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        scroll = factory.createScroll();
        radio = factory.createRadio();
    }

    public void paintCheckbox() {
        checkbox.paint();
    }

    public void paintButton() {
        button.paint();
    }

    public void paintScroll() {
        scroll.paint();
    }

    public void paintRadio() {
        radio.paint();
    }
}
