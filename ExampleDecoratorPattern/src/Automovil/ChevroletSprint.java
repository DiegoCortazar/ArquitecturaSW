/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automovil;

/**
 *
 * @author DiegoCortazar
 */
public class ChevroletSprint extends Automovil {

    @Override
    public String getDescription() {
        return "Chevrolet Sprint, Modelo 2002, Color Plata";
    }

    //Metodos de la clase retorna un Int
    @Override
    public int getPrice() {
        return 25000000;
    }
}
