/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import app.Application;

/**
 *
 * @author Usuario
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application app = new Application();

        //app.orderSimpleProducts();
        app.orderCorpoPc();
        
        app.orderLaptop();
    }

}
