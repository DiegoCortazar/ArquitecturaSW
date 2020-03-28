/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Diego
 */
public class Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SalonDeChat s = new SalonDeChat();
        SalonDeChatPrivado sP = new SalonDeChatPrivado();

        UsuarioChat u = new UsuarioChat(s,sP);
        u.setNombre("Juan");
        s.registra(u);

        UsuarioChat u1 = new UsuarioChat(s,sP);
        u1.setNombre("Pepe");
        s.registra(u1);

        UsuarioChat u2 = new UsuarioChat(s,sP);
        u2.setNombre("Pedro");
        s.registra(u2);

        u.envia("Pepe", "Hola como andas?");
        u1.envia("Juan", "Todo ok, vos?");
        u2.envia("Pedro", "Martin estas?");

        UsuarioChat u3 = new UsuarioChat(s,sP);
        u3.setNombre("Andres");
        sP.registra(u3);

        UsuarioChat u4 = new UsuarioChat(s,sP);
        u4.setNombre("Diego");

        sP.bloquearUsuario(u3);
        sP.desbloquearUsuario(u3);
        
        sP.invitarUsuario(u4);
        sP.BuscarUsuario(u4);

    }

}
