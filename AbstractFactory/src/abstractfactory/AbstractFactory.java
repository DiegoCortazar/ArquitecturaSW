/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import app.Application;
import factories.GUIFactory;
import factories.LinuxFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 *
 * @author Usuario
 */
public class AbstractFactory {

    //TODO Definir al menos 2 elementos visuales adicionales en la fábrica abstracta e implementar su creación.
    //TODO Extender el ejemplo para crear elementos visuales en linux.
    public static void main(String[] args) {

        GUIFactory concreteGuiFactory;
        Application appClient;

        String osName = "lin";

        switch (osName) {
            case "mac":
                concreteGuiFactory = new MacOSFactory();
                appClient = new Application(concreteGuiFactory);
                break;
            case "win":
                concreteGuiFactory = new WindowsFactory();
                appClient = new Application(concreteGuiFactory);
                break;
            case "lin":
                concreteGuiFactory = new LinuxFactory();
                appClient = new Application(concreteGuiFactory);
                break;
            default:
                System.out.println("Error! No se definió un SO válido.");
                appClient = null;
                break;
        }

        if (appClient != null) {
            appClient.paintButton();
            appClient.paintCheckbox();
            appClient.paintScroll();
            appClient.paintRadio();
        }
    }

}
