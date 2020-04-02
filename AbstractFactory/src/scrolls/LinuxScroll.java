package scrolls;

/**
 * Todos los componentes concretos se aplican a múltiples sistemas operativos. Ejm. MacOS/Windows
 *
 * Ésta es una implementación concreta de pintar botón de un MacOS
 */
public class LinuxScroll implements Scroll {

    @Override
    public void paint() {
        System.out.println("Has creado un Scroll de Linux!!!");
    }
}
