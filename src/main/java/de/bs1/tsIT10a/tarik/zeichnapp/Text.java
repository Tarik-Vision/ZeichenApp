package de.bs1.tsIT10a.tarik.zeichnapp;

import java.awt.*;

public class Text extends GrafikKomponente {
    private String text;


    public Text(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void zeichne(Graphics g) {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Text von {" + x + "," + y + "} nach {" + text + "}";
    }
}
