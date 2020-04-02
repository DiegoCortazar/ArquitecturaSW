/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import buttons.Button;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.LinuxCheckbox;
import radios.LinuxRadio;
import radios.Radio;
import scrolls.LinuxScroll;
import scrolls.Scroll;

/**
 *
 * @author Diego
 */
public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public Scroll createScroll() {
        return new LinuxScroll();
    }

    @Override
    public Radio createRadio() {
        return new LinuxRadio();
    }
}
