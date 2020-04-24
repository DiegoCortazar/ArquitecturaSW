/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Diego
 */
public class Contexto {

    public String getAscii(String i) {
        char character = i.charAt(0);
        int ascii = (int) character;
        return Integer.toString(ascii);
    }

    public String getToBase64(String i) {
        return Base64.getEncoder().encodeToString(i.getBytes());
    }

    public String getToHexa(String i) throws UnsupportedEncodingException {
        byte[] myBytes = i.getBytes("UTF-8");
        return DatatypeConverter.printHexBinary(myBytes);
    }

    public String getToBinary(String i) {
        byte[] bytes = i.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int j = 0; j < 8; j++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        return binary.toString();
    }

}
