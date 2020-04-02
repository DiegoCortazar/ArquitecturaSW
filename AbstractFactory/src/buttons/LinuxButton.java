package buttons;

/**
 * Todos los componentes concretos se aplican a múltiples sistemas operativos. Ejm. MacOS/Windows
 *
 * Ésta es una implementación concreta de pintar botón de un MacOS
 */
public class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("Has creado un botón de Linux!!!");
    }
}
