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
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese El Precio del plan: ");
        int tipoPaquete = sc.nextInt();
        
        PlanTelefoniaFactory factory = new PlanTelefoniaFactory();
        PlanTelefonia paquete =  factory.getPaquete(tipoPaquete);
        paquete.setTelefono("3134569877");
        String telefono = paquete.getTelefono();
        
        System.out.println("Su numero " + telefono + " Tiene: ");
        paquete.descripcionPaquete();
    
    }
    
}
