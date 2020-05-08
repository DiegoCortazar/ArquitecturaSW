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
public class Presidente extends Aprobador {

    @Override
    public void manejarPeticion(int diasPermiso) {

        if (diasPermiso > 5) {
            System.out.println("Yo 'Presidente' Manejo Esta Solicitud");
        } else {
            System.out.println("Yo 'Presidente' No Puedo Manejar Esta Solicitud");
            sucesor.manejarPeticion(diasPermiso);
        }
    }

    @Override
    public void manejarPeticionEspecial(int diasPermiso) {
        if (diasPermiso > 5) {
            System.out.println("Yo 'Presidente' Manejo Esta Solicitud Especial");
        } else {
            System.out.println("Yo 'Presidente' No Puedo Manejar Esta Solicitud Especial");
            sucesor.manejarPeticion(diasPermiso);
        }
    }
}
