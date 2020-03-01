package exampledecoratorpattern;

import Automovil.BMW;
import Tuneado.VidriosElectricos;
import Tuneado.Mp4Player;
import Tuneado.LlantasLujo;
import Tuneado.AireAcondicionado;
import Automovil.ChevroletSail;
import Automovil.ChevroletSprint;
import Automovil.Mazda3;
import Tuneado.Blindaje;
import Tuneado.GPS;
import Tuneado.Polarizado;
import Tuneado.Radio;
import java.util.Scanner;

public class ExampleDecoratorPattern {

    private static Scanner sc;

    public static void main(String[] args) {

        VentaAuto automovil = null;

        System.out.println("---Selecciones un Vehículo--- \n"
                + "1. Chevrolet Sail \n"
                + "2. Mazda 3 \n"
                + "3. BMW \n"
                + "4. Chevrolet Sprint \n");

        sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                automovil = new ChevroletSail();
                automovil = new Mp4Player(automovil);
                automovil = new LlantasLujo(automovil);
                automovil = new AireAcondicionado(automovil);
                automovil = new VidriosElectricos(automovil);
                automovil = new Polarizado(automovil);
                automovil = new Blindaje(automovil);
                automovil = new Radio(automovil);
                automovil = new GPS(automovil);
                break;

            case 2:
                automovil = new Mazda3();
                automovil = new Mp4Player(automovil);
                automovil = new LlantasLujo(automovil);
                automovil = new AireAcondicionado(automovil);
                automovil = new VidriosElectricos(automovil);
                automovil = new Polarizado(automovil);
                automovil = new Blindaje(automovil);
                automovil = new Radio(automovil);
                automovil = new GPS(automovil);
                break;

            case 3:
                automovil = new BMW();
                automovil = new Mp4Player(automovil);
                automovil = new LlantasLujo(automovil);
                automovil = new AireAcondicionado(automovil);
                automovil = new VidriosElectricos(automovil);
                automovil = new Polarizado(automovil);
                automovil = new Blindaje(automovil);
                automovil = new Radio(automovil);
                automovil = new GPS(automovil);
                break;

            case 4:
                automovil = new ChevroletSprint();
                automovil = new Mp4Player(automovil);
                automovil = new LlantasLujo(automovil);
                automovil = new AireAcondicionado(automovil);
                automovil = new VidriosElectricos(automovil);
                automovil = new Polarizado(automovil);
                automovil = new Blindaje(automovil);
                automovil = new Radio(automovil);
                automovil = new GPS(automovil);
                break;
        }

        System.out.println(automovil.getDescription());
        System.out.println("Su precio es: " + automovil.getPrice());

    }

}
