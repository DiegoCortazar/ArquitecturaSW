/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Diego
 */
public class MementoDemo {

    public static void main(String[] args) {

        String name = "Juanito";
        String lastName = "Perez";
        int age = 15;
        String careeer = "Ing. Sistemas";
        String residence = "Cra 15 A";
        String cellphone = "3132508720";

        Persona persona;
        Caretaker ctaker = new Caretaker();
        Originator onator = new Originator();

        persona = new Persona();
        persona.setNombre(name);
        persona.setApellidos(lastName);
        persona.setEdad(age);
        persona.setCarrera(careeer);
        persona.setDireccion(residence);
        persona.setTelefono(cellphone);
        onator.setState(persona);
        ctaker.addMemento(onator.save());

        persona = new Persona();
        persona.setNombre(name);
        persona.setApellidos(lastName);
        persona.setEdad(20);
        persona.setCarrera(careeer);
        persona.setDireccion("CRA 50 #20-13");
        persona.setTelefono(cellphone);
        onator.setState(persona);
        ctaker.addMemento(onator.save());

        persona = new Persona();
        persona.setNombre(name);
        persona.setApellidos(lastName);
        persona.setEdad(25);
        persona.setCarrera("Ing. Industrial");
        persona.setDireccion("Cll 170 # 22-11");
        persona.setTelefono("3004508540");
        onator.setState(persona);
        ctaker.addMemento(onator.save());

        onator.restore(ctaker.getMemento(1));
        persona = onator.getEstado();
        System.out.println(persona);
    }
}
