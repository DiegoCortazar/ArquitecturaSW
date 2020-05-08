package flyweight;

public class LapizMedio implements Lapiz {

    final EGrosor grosor = EGrosor.MEDIO;    //Estado intrínseco - compartido
    private String color = null;                //Estado extrpinseco - entregado por el cliente

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void dibujar(String contenido) {
        System.out.println("Dibujando con lápiz " + grosor + " - Color: " + color);
        System.out.println(contenido);
        System.out.println(this.hashCode());
    }
}