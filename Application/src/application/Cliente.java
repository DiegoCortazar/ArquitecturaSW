/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Planes.PlanTelefonia;
import Planes.PlanTelefoniaFactory;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese El Precio del plan: ");
        int tipoPaquete = sc.nextInt();
        
        PlanTelefonia paquete =  new PlanTelefoniaFactory().getPaquete(tipoPaquete);
        paquete.setTelefono("77587875");
        String telefono = paquete.getTelefono();
        
        System.out.println("Su numero " + telefono + " Tiene: ");
        paquete.descripcionPaquete();
    
    }
    
}
