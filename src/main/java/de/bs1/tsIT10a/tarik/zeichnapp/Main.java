package de.bs1.tsIT10a.tarik.zeichnapp;

import java.awt.*;

public class Main {
    private Linie l;
    private Ellipse e;
    private Text t;

    public Main() {
        this.l = new Linie(0, 0, 100, 100);
        zeichneAlles(null);
    }

    public void zeichneAlles(Graphics g) {
        this.l.zeichne(g);

    }
}
