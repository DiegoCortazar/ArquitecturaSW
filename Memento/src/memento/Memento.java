/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Diego
 */
public class Memento {

    private Persona per;

    public Memento(Persona per) {
        this.per = per;
    }

    public Persona getState() {
        return per;
    }
}
