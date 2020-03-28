/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class SalonDeChatPrivado implements ISalonDeChatPrivado {

    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario Inexistente");
        }
    }

    @Override
    public void bloquearUsuario(Usuario participante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desbloquearUsuario(Usuario participante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void invitarUsuario(Usuario participante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarUsuario(String participante) {
        if (participantes.containsKey(participante)) {
            participantes.get(participante);
            System.out.println("El Usuario: " + participante + " Existe!");
        } else {
            System.out.println("El Usuario No Existe");
        }

    }
}
