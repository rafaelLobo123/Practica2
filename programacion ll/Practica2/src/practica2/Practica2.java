package practica2;

import javax.swing.*;
import java.awt.*;

class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}

class Linea {
    public Punto p1;
    public Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dibujaLinea(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
    }
}

class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void dibujaCirculo(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval((int) (centro.x - radio), (int) (centro.y - radio), (int) (2 * radio), (int) (2 * radio));

        // Dibuja el radio
        g.setColor(Color.GREEN);
        g.drawLine((int) centro.x, (int) centro.y, (int) (centro.x + radio), (int) centro.y);
    }
}

public class Practica2 extends JPanel {
    Linea linea;
    Circulo circulo;

    public Practica2() {
        Punto p1 = new Punto(100, 100);
        Punto p2 = new Punto(300, 200);
        linea = new Linea(p1, p2);
        circulo = new Circulo(p1, 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.dibujaLinea(g);
        circulo.dibujaCirculo(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujar Línea y Círculo");
        Practica2 panel = new Practica2();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
