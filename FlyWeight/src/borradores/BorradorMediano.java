/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borradores;

/**
 *
 * @author Diego
 */
public class BorradorMediano implements Borrador {

    final ETamaño tamaño = ETamaño.MEDIANO;
    private String forma = null;

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public void borrar(String contenido) {
        System.out.println("Utilizando un borrador " + tamaño + " - Forma: " + forma);
        System.out.println(contenido);
        System.out.println(this.hashCode());
    }
}

