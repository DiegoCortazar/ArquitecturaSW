/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuneado;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

/**
 *
 * @author DiegoCortazar
 */
public class Blindaje extends AutomovilDecorator{
       public Blindaje(VentaAuto ventaAuto){
        super(ventaAuto);
    }
    
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "+ Blindaje";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public int getPrice(){
        return getVentaAuto().getPrice()+ 3500000;
    }
}
