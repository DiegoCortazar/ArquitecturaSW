/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class TextToAscii implements Expression {

    private String i;

    public TextToAscii(String c) {
        this.i = c;
    }

    @Override
    public String interpreter(Contexto contexto) {
        return contexto.getAscii(this.i);
    }

}
