/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planes;

/**
 *
 * @author Usuario
 */
public class PlanTelefoniaFactory {
    public PlanTelefonia getPaquete(int tipoPaquete){
        
        if(tipoPaquete==5000){
            return new Paquete1();
        }
        
        if(tipoPaquete==10000){
            return new Paquete2();
        }
        
        if(tipoPaquete==20000){
            return new Paquete3();
        }
        
        return null;
        
    }
}
