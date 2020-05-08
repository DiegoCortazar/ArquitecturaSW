package flyweight;

import borradores.Borrador;
import borradores.BorradorFactory;

public class DemoCliente {

    public static void main(String[] args) {

//        Lapiz lapizVerdeDelgado1 = LapizFactory.getLapizDelgado("Verde");  
//        lapizVerdeDelgado1.dibujar("Hello World en verde!");
//
//        Lapiz lapizVerdeDelgado2 = LapizFactory.getLapizDelgado("Verde"); 
//        lapizVerdeDelgado2.dibujar("Hello World en verde por otro usuario!");
//
//        Lapiz lapizAzulGrueso1 = LapizFactory.getLapizGrueso("Azul");       
//        lapizAzulGrueso1.dibujar("Hello World en azul!");
//
//        Lapiz lapizAzulGrueso2 = LapizFactory.getLapizGrueso("Azul");       
//        lapizAzulGrueso2.dibujar("Hello World en azul por otro usuario!");
        Borrador borradorPeqCir = BorradorFactory.getBorradorPequeño("Circulo");
        borradorPeqCir.borrar("Borrando con Pequeño Circular");

        Borrador borradorPeqCir2 = BorradorFactory.getBorradorPequeño("Circulo");
        borradorPeqCir2.borrar("Borrando con Pequeño Circular por otro usuario!");

        Borrador borradorMedCuad = BorradorFactory.getBorradorMediano("Cuadrado");
        borradorMedCuad.borrar("Borrando con Mediano Cuadrado!");

        Borrador borradorGranTrian = BorradorFactory.getBorradorGrande("Triangular");
        borradorGranTrian.borrar("Borrando con Grande Triangular!");

        System.out.println("Hash de objeto: " + borradorPeqCir.getClass().getName() + " " + borradorPeqCir.hashCode());
        System.out.println("Hash de objeto: " + borradorPeqCir2.getClass().getName() + " " + borradorPeqCir2.hashCode());

        System.out.println("Hash de objeto: " + borradorMedCuad.getClass().getName() + " " + borradorMedCuad.hashCode());
        System.out.println("Hash de objeto: " + borradorGranTrian.getClass().getName() + " " + borradorGranTrian.hashCode());

    }
}
