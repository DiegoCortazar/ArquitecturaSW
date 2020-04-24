/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class TextToHexa implements Expression {

    private String i;

    public TextToHexa(String c) {
        this.i = c;
    }

    @Override
    public String interpreter(Contexto contexto) {
        try {
            return contexto.getToHexa(this.i);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TextToHexa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
}
