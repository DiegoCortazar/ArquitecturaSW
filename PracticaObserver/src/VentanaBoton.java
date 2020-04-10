
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego
 */
public class VentanaBoton extends JFrame implements Observer {

    JLabel titulo;
    JButton color;
    int colorSeleccionado;
    ClaseObservador miObservador;

    public VentanaBoton(ClaseObservador observador) {
        miObservador = observador;
        titulo = new JLabel();
        titulo.setText("Color Seleccionado");
        titulo.setBounds(20, 10, 150, 25);

        color = new JButton();
        color.setText("No Ha seleccionado un Color");
        color.setBounds(20, 40, 180, 25);

        add(titulo);
        add(color);

        setSize(230, 150);
        setTitle("Ventana Color Boton");
        setLocation(900, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        colorSeleccionado = miObservador.getColorSeleccionado();
        switch (colorSeleccionado) {
            case 1:
                color.setText(miObservador.getColor());
                color.setBackground(Color.YELLOW);
                break;
            case 2:
                color.setText(miObservador.getColor());
                color.setBackground(Color.BLUE);
                break;
            case 3:
                color.setText(miObservador.getColor());
                color.setBackground(Color.RED);
                break;
            case 4:
                color.setText(miObservador.getColor());
                color.setBackground(Color.GREEN);
                break;
            case 5:
                color.setText(miObservador.getColor());
                color.setBackground(Color.BLACK);
                break;
            case 6:
                color.setText(miObservador.getColor());
                color.setBackground(Color.WHITE);

                break;
            case 7:
                color.setText(miObservador.getColor());
                color.setBackground(Color.ORANGE);

                break;
            default:
                color.setText("No Ha seleccionado un Color");

        }
    }

}
