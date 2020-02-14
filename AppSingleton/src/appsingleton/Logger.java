/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsingleton;

/**
 *
 * @author DiegoCortazar
 */
public class Logger {

    private static Logger log;

    private Logger() {
    }

    public static Logger getInstance() {
        if(log==null){
            log = new Logger();
        }
        
        return log;
    }
    
    public void log(String mensaje){
        System.out.println(mensaje);
    }

}
