/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author Diego
 * 
 */
public class Contexto {

    private ICiframiento iCiframiento;
    private CiframientoLlavePrivada llavePrivada;
    private CiframientoLLavePublica llavePublica;

    public Contexto(ICiframiento iCiframiento) {
        this.iCiframiento = iCiframiento;
    }

    public void ciframiento(String texto, String Cifrar) {

        switch (Cifrar) {
            case Interfaces.AES: {
                try {
                    System.out.println("-Cifrado AES ");
                    System.out.println("Texto a Cifrar: \n" + texto);
                    llavePrivada = (CiframientoLlavePrivada) this.iCiframiento;
                    System.out.println("Texto Cifrado:");
                    llavePrivada.setLlavePrivada(iCiframiento.EncriptarLlave(texto));
                    System.out.println(llavePrivada.getLlavePrivada());
                    System.out.println("");
                } catch (Exception e) {
                    System.out.println("Problema" + e);
                }
                break;
            }
            case Interfaces.DES: {
                try {
                    System.out.println("-Cifrado DES");
                    System.out.println("Texto a Cifrar: \n" + texto);
                    llavePrivada = (CiframientoLlavePrivada) this.iCiframiento;
                    System.out.println("Texto Cifrado:");
                    llavePrivada.setLlavePrivada(iCiframiento.EncriptarLlave(texto));
                    System.out.println(llavePrivada.getLlavePrivada());
                    System.out.println("");
                } catch (Exception e) {
                    System.out.println("Problema" + e);
                }
                break;
            }
            case Interfaces.TRESDES: {
                try {
                    System.out.println("-Cifrado en 3DES ");
                    System.out.println("Texto a Cifrar: \n" + texto);
                    llavePrivada = (CiframientoLlavePrivada) this.iCiframiento;
                    llavePrivada.setLlavePrivada(iCiframiento.EncriptarLlave(texto));
                    System.out.println("Texto Cifrado:");
                    System.out.println(llavePrivada.getLlavePrivada());
                    System.out.println("");
                } catch (Exception e) {
                }
                break;
            }
            case Interfaces.RSA: {
                try {
                    System.out.println("-Cifrado en RSA");
                    System.out.println("Texto a Cifrar: \n" + texto);
                    llavePublica = (CiframientoLLavePublica) this.iCiframiento;
                    System.out.println("Texto Cifrado:");
                    System.out.println(llavePublica.EncriptarLlave(texto));
                    System.out.println("");
                } catch (Exception e) {
                }
                break;
            }
            case Interfaces.ELGAMAL: {
                try {
                    System.out.println("-Cifrado en ElGamal");
                    System.out.println("Texto a Cifrar: \n" + texto);
                    llavePublica = (CiframientoLLavePublica) this.iCiframiento;
                    System.out.println("Texto Cifrado:");
                    System.out.println(llavePublica.EncriptarLlave(texto));
                    System.out.println("");
                } catch (Exception e) {
                } 
                break;
            }
            default: {
                System.out.println("No hay coincidencia");
            }
        }

    }
}
