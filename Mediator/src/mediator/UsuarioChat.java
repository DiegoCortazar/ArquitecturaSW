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
public class UsuarioChat implements IUsuarioChat{
    private String nombre;
    private SalonDeChat salon;
    private SalonDeChatPrivado salonPr;
    
    public UsuarioChat(SalonDeChat salonDeChat, SalonDeChatPrivado pr){
        salon = salonDeChat;
        salonPr = pr;
    }
    
    @Override
    public void recibe(String de, String msg){
        String s = "El Usuario " + de + " Te Dice: " + msg;
        System.out.println(nombre + " : " + s);
    }
    
    @Override
    public void envia(String a, String msg){
        salon.envia(nombre, a, msg);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
