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
public interface ISalonDeChatPrivado {

    public abstract void bloquearUsuario(Usuario participante);

    public abstract void desbloquearUsuario(Usuario participante);

    public abstract void invitarUsuario(Usuario participante);

    public abstract void buscarUsuario(Usuario participante);

}
