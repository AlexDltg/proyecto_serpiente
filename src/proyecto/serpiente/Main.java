package proyecto.serpiente;

import java.awt.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
    }

    public void paint(Graphics g) {
        //super.paint(g);
        int ESPACIO_ENTRE_COLUMNAS = 3131;
        int ESPACIO_ENTRE_FILAS = 3131;
        int COLUMNAS = 3131;
        int FILAS = 3131;


        Color c = g.getColor();
        g.setColor(Color.BLUE);
        // Dibujamos lineas horizontales
        g.drawLine(50, 50 + 0 * ESPACIO_ENTRE_FILAS, COLUMNAS * ESPACIO_ENTRE_COLUMNAS + 50, 50 + 0 * ESPACIO_ENTRE_FILAS);
        g.drawLine(50, 50 + 1 * ESPACIO_ENTRE_FILAS, COLUMNAS * ESPACIO_ENTRE_COLUMNAS + 50, 50 + 1 * ESPACIO_ENTRE_FILAS);
        g.drawLine(50, 50 + 2 * ESPACIO_ENTRE_FILAS, COLUMNAS * ESPACIO_ENTRE_COLUMNAS + 50, 50 + 2 * ESPACIO_ENTRE_FILAS);
        g.drawLine(50, 50 + 3 * ESPACIO_ENTRE_FILAS, COLUMNAS * ESPACIO_ENTRE_COLUMNAS + 50, 50 + 3 * ESPACIO_ENTRE_FILAS);
        g.drawLine(50, 50 + 4 * ESPACIO_ENTRE_FILAS, COLUMNAS * ESPACIO_ENTRE_COLUMNAS + 50, 50 + 4 * ESPACIO_ENTRE_FILAS);
        g.drawLine(50, 50 + 5 * ESPACIO_ENTRE_FILAS, COLUMNAS * ESPACIO_ENTRE_COLUMNAS + 50, 50 + 5 * ESPACIO_ENTRE_FILAS);

        // Dibujamos lineas verticales

        g.drawLine(50 + 0 * ESPACIO_ENTRE_COLUMNAS, 50, 50 + 0 * ESPACIO_ENTRE_COLUMNAS, 50 + FILAS * ESPACIO_ENTRE_FILAS);
        g.drawLine(50 + 1 * ESPACIO_ENTRE_COLUMNAS, 50, 50 + 1 * ESPACIO_ENTRE_COLUMNAS, 50 + FILAS * ESPACIO_ENTRE_FILAS);
        g.drawLine(50 + 2 * ESPACIO_ENTRE_COLUMNAS, 50, 50 + 2 * ESPACIO_ENTRE_COLUMNAS, 50 + FILAS * ESPACIO_ENTRE_FILAS);

        g.drawLine(50 + COLUMNAS * ESPACIO_ENTRE_COLUMNAS, 50, 50 + COLUMNAS * ESPACIO_ENTRE_COLUMNAS, 50 + FILAS * ESPACIO_ENTRE_FILAS);

        g.setColor(Color.BLACK);
        g.setColor(c);
    }
}
