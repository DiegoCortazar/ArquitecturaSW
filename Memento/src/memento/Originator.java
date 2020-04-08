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
public class Originator {

    private Persona state;

    public void setState(Persona state) {
        this.state = state;
    }

    public Persona getEstado() {
        return state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento m) {
        this.state = m.getState();
    }
}
