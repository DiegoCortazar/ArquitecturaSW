/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import Ciphers.DES;
import Ciphers.RSA;
import Ciphers.TresDES;
import Ciphers.AES;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Cliente {

    static Scanner sc;
    static Scanner tx;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        tx = new Scanner(System.in);

        System.out.println("Texto A Cifrar: ");
        String texto = tx.nextLine();

        System.out.println("Seleccione Método de Ciframiento \n"
                + "1. TresDes \n"
                + "2. RSA \n"
                + "3. AES \n"
                + "4. DES \n"
                + "5. ElGamal \n"
        );

        int opcion = sc.nextInt();

        Contexto ctx;

        switch (opcion) {
            case 1:
                ctx = new Contexto(new TresDES());
                ctx.ciframiento(texto, Interfaces.TRESDES);
                break;
            case 2:
                ctx = new Contexto(new RSA());
                ctx.ciframiento(texto, Interfaces.RSA);
                break;

            case 3:
                ctx = new Contexto(new AES());
                ctx.ciframiento(texto, Interfaces.AES);
                break;

            case 4:
                ctx = new Contexto(new DES());
                ctx.ciframiento(texto, Interfaces.DES);
                break;
        }

    }
}
