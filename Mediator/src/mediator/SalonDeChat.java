/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class SalonDeChat implements ISalonDeChat {

    private HashMap<String, UsuarioChat> participantes = new HashMap<String, UsuarioChat>();

    @Override
    public void registra(UsuarioChat user) {
        participantes.put(user.getNombre(), user);
    }

    @Override
    public void envia(String de, String a, String msg) {

        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            UsuarioChat u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario No Existe");
        }
    }

    public HashMap<String, UsuarioChat> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(HashMap<String, UsuarioChat> participantes) {
        this.participantes = participantes;
    }

}
