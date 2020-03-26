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
public class Usuario implements IUsuarioChat {

    private String nombre;
    private SalonDeChat salon;

    public Usuario(SalonDeChat salonDeChat) {
        salon = salonDeChat;
    }

    @Override
    public void recibe(String de, String msg) {
        String s = "El Usuario: " + de + " te dice: " + msg;
        System.out.println("Nombre: " + nombre + ", " +s);
    }

    @Override
    public void envia(String a, String msg) {
        salon.envia(nombre, a, msg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public SalonDeChat getSalon() {
//        return salon;
//    }
//
//    public void setSalon(SalonDeChat salon) {
//        this.salon = salon;
//    }

}
