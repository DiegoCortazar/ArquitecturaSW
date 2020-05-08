/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Diego
 */
public abstract class Aprobador {

    protected Aprobador sucesor;

    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }

    public abstract void manejarPeticion(int diasPermiso);
    
    public abstract void manejarPeticionEspecial(int diasPermiso);

}
