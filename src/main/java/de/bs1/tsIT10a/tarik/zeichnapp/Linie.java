package de.bs1.tsIT10a.tarik.zeichnapp;

import java.awt.*;

public class Linie extends GrafikKomponente {
    private int x2;
    private int y2;


    public Linie(int x, int y, int x2, int y2) {
        this.x = x2;
        this.y = y2;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void zeichne(Graphics g) {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Linie von {" + x + "," + y + "} nach {" + x2 + "," + y2 + "}";
    }
}
