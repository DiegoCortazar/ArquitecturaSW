/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import Modelo.Contexto;
import Modelo.Expression;
import Modelo.TextToAscii;
import Modelo.TextToBase64;
import Modelo.TextToBinary;
import Modelo.TextToHexa;

/**
 *
 * @author Diego
 */
public class Interpreter {

    public Contexto ic;

    public Interpreter(Contexto i) {
        this.ic = i;
    }

    public String interpreter(String str) {
        Expression exp = null;
        if (str.contains("ASCII")) {
            exp = new TextToAscii(str.substring(0, str.indexOf(" ")));
        } else if (str.contains("Base64")) {
            exp = new TextToBase64(str.substring(0, str.indexOf(" ")));
        } else if (str.contains("Hexadecimal")) {
            exp = new TextToHexa(str.substring(0, str.indexOf(" ")));
        } else if (str.contains("Binario")) {
            exp = new TextToBinary(str.substring(0, str.indexOf(" ")));
        }
        return exp.interpreter(ic);
    }

    public static void main(String[] args) {

        String str1 = "B in ASCII";
        String str2 = "Hola in Base64";
        String str3 = "Chao in Hexadecimal";
        String str4 = "Diego in Binario";

        Interpreter ec = new Interpreter(new Contexto());
        System.out.println(str1 + " : " + ec.interpreter(str1));
        System.out.println(str2 + " : " + ec.interpreter(str2));
        System.out.println(str3 + " : " + ec.interpreter(str3));
        System.out.println(str4 + " : " + ec.interpreter(str4));

    }

}
