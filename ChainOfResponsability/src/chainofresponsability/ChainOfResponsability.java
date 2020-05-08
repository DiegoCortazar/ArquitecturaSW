/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Usuario
 */
public class ChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aprobador m1 = new Coordinador();
        Aprobador m2 = new Director();
        Aprobador m3 = new Gerente();
        Aprobador m4 = new Presidente();

        m1.setSucesor(m2);
        m2.setSucesor(m3);
        m3.setSucesor(m4);
        
        m1.manejarPeticion(1);
        m3.manejarPeticionEspecial(3);
     
    }

}
