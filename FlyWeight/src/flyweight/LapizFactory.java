package flyweight;

import java.util.HashMap;

public class LapizFactory {

    private static final HashMap<String, Lapiz> lapicesMap = new HashMap<>();

    public static Lapiz getLapizGrueso(String color) {

        String key = color + " - GRUESO";

        Lapiz lapiz = lapicesMap.get(key);

        if(lapiz != null) {
            return lapiz;
        } else {
            lapiz = new LapizGrueso();
            lapiz.setColor(color);
            lapicesMap.put(key, lapiz);
        }

        return lapiz;
    }

    public static Lapiz getLapizDelgado(String color) {

        String key = color + " - DELGADO";

        Lapiz lapiz = lapicesMap.get(key);

        if(lapiz != null) {
            return lapiz;
        } else {
            lapiz = new LapizDelgado();
            lapiz.setColor(color);
            lapicesMap.put(key, lapiz);
        }

        return lapiz;
    }

    public static Lapiz getLapizMedio(String color) {

        String key = color + " - MEDIO";

        Lapiz lapiz = lapicesMap.get(key);

        if(lapiz != null) {
            return lapiz;
        } else {
            lapiz = new LapizMedio();
            lapiz.setColor(color);
            lapicesMap.put(key, lapiz);
        }

        return lapiz;
    }
}
