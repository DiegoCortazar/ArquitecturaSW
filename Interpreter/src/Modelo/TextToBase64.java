/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diego
 */
public class TextToBase64 implements Expression{

    private String i;

    public TextToBase64(String c) {
        this.i = c;
    }
    @Override
    public String interpreter(Contexto contexto) {
        return contexto.getToBase64(this.i);
    }
    
}
