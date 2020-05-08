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
public class Director extends Aprobador {

    @Override
    public void manejarPeticion(int diasPermiso) {

        if (diasPermiso > 1 && diasPermiso <= 3) {
            System.out.println("Yo 'Director' Manejo Esta Solicitud");
        } else {
            System.out.println("Yo 'Director' No Puedo Manejar Esta Solicitud");
            sucesor.manejarPeticion(diasPermiso);
        }
    }

    @Override
    public void manejarPeticionEspecial(int diasPermiso) {
        System.out.println("Yo 'Director' No Manejo Solicitudes Especiales");
    }

}
