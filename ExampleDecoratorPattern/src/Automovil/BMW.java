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
public class BMW extends Automovil {

    @Override
    public String getDescription() {
        return "BMW, Modelo 2020, Color Azul";
    }

    //Metodos de la clase retorna un Int
    @Override
    public int getPrice() {
        return 90000000;
    }
}
