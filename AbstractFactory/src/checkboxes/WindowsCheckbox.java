package checkboxes;

/**
 * Todos los componentes concretos se aplican a múltiples sistemas operativos. Ejm. MacOS/Windows
 *
 * Ésta es una implementación concreta de pintar checkbox de un windows
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Has creado un checkbox de windows!!!");
    }
}