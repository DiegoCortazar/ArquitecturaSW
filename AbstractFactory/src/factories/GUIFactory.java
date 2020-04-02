package factories;

import buttons.Button;
import checkboxes.Checkbox;
import scrolls.Scroll;
import radios.Radio;



/**
 * La fábrica abstracta (Interfaz) conoce los tipos de productos que se crean.
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
    
    Scroll createScroll();
    
    Radio createRadio();
}
