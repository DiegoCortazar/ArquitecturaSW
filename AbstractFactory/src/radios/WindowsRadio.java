package radios;

/**
 * Todos los componentes concretos se aplican a múltiples sistemas operativos. Ejm. MacOS/Windows
 *
 * Ésta es una implementación concreta de pintar botón de un windows
 */
public class WindowsRadio implements Radio {

    @Override
    public void paint() {
        System.out.println("Has creado un Radio Button de Windows!!!");
    }
}
