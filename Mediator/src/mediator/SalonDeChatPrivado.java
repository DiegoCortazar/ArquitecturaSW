/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.HashMap;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 *
 * @author Diego
 *
 */
public class SalonDeChatPrivado implements ISalonDeChat {

    private SalonDeChat salon = new SalonDeChat();
    private HashMap<String, UsuarioChat> participantes = this.salon.getParticipantes();
    private HashMap<String, UsuarioChat> usersBloqueados = new HashMap<String, UsuarioChat>();

    @Override
    public void registra(UsuarioChat user) {
        salon.registra(user);
    }

    @Override
    public void envia(String de, String a, String msg) {
      
        if (usersBloqueados.containsKey(de)) {
            System.out.println(participantes.get(de).getNombre()+ " Esta Bloqueado");
        } else if (usersBloqueados.containsKey(a)) {
            System.out.println("El Usuario esta bloqueado");
        } else {
            salon.envia(de, a, msg);
        }
    }

    public void bloquearUsuario(UsuarioChat user) {
        if (participantes.containsKey(user.getNombre())) {
            usersBloqueados.put(user.getNombre(), user);
            System.out.println("El usuario " + user.getNombre() + " Ha sido bloqueado");
        } else {
            System.out.println("El usuario No Existe");
        }
    }

    public void desbloquearUsuario(UsuarioChat user) {
        if (participantes.containsKey(user.getNombre()) && usersBloqueados.containsKey(user.getNombre())) {
            usersBloqueados.remove(user.getNombre(), user);
            System.out.println("El usuario: " + user.getNombre() + " ha sido desbloqueado");
        } else {
            System.out.println("El usuario No Existe o No Esta Bloqueado");
        }
    }

    public void invitarUsuario(UsuarioChat user) {
        participantes.put(user.getNombre(), user);
        System.out.println("Se Invitó a: " + user.getNombre() );
    }

    public void BuscarUsuario(UsuarioChat user) {
        if (participantes.containsKey(user.getNombre())) {
            System.out.println("El usuario existe");
        }else{
            System.out.println("Usuario No Existe");
        }
    }
}
