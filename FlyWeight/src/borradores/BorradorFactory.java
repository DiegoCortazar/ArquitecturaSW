/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borradores;

import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class BorradorFactory {

    private static final HashMap<String, Borrador> borradoresMap = new HashMap<>();

    public static Borrador getBorradorPequeño(String forma) {

        String key = forma + " - Pequeño";

        Borrador borrador = borradoresMap.get(key);

        if (borrador != null) {
            return borrador;
        } else {
            borrador = new BorradorPequeño();
            borrador.setForma(forma);
            borradoresMap.put(key, borrador);
        }
        return borrador;
    }
    
    
    public static Borrador getBorradorMediano(String forma) {

        String key = forma + " - Mediano";

        Borrador borrador = borradoresMap.get(key);

        if (borrador != null) {
            return borrador;
        } else {
            borrador = new BorradorMediano();
            borrador.setForma(forma);
            borradoresMap.put(key, borrador);
        }
        return borrador;
    }
    
    
    public static Borrador getBorradorGrande(String forma) {

        String key = forma + " - Grande";

        Borrador borrador = borradoresMap.get(key);

        if (borrador != null) {
            return borrador;
        } else {
            borrador = new BorradorGrande();
            borrador.setForma(forma);
            borradoresMap.put(key, borrador);
        }
        return borrador;
    }
}
