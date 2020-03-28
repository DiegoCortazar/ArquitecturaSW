/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author DiegoCortazar
 */
public class Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalonDeChat s = new SalonDeChat();
        SalonDeChatPrivado chPr = new SalonDeChatPrivado();

        Usuario u = new Usuario(s);
        u.setNombre("Juan");
        s.registra(u);
        chPr.registra(u);

        Usuario u1 = new Usuario(s);
        u1.setNombre("Pepe");
        s.registra(u1);
        chPr.registra(u1);

        Usuario u2 = new Usuario(s);
        u2.setNombre("Pedro");
        s.registra(u2);
        chPr.registra(u2);

        u.envia("Pepe", "Hola, Cómo Andas?");
        u1.envia("Juan", "Todo Ok, Vos?");
        u2.envia("Martin", "Martin Estás?");

        chPr.buscarUsuario("Pepe");

    }

}
