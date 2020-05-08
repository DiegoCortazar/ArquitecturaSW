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
public class Coordinador extends Aprobador {

    @Override
    public void manejarPeticion(int diasPermiso) {
        // TODO Auto-generated method stub
        if (diasPermiso == 1) {
            System.out.println("Yo 'Coordinador' Manejo Esta Solicitud");
        } else {
            System.out.println("Yo 'Coordinador' No Puedo Manejar Esta Solicitud");
            sucesor.manejarPeticion(diasPermiso);
        }
    }

    @Override
    public void manejarPeticionEspecial(int diasPermiso) {
            System.out.println("Yo 'Coordinador' No Manejo Solicitudes Especiales");
    }

}
