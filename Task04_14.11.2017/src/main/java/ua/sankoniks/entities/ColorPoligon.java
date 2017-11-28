package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

/**
 * Created by Sanko on 28.11.17.
 */
public class ColorPoligon extends Poligon implements Colored {

    private int color;

    public ColorPoligon(Point[] arrPoints, int color) {
        super(arrPoints);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "ColorPoligon{" +
                "color=" + color +
                "} " + super.toString();
    }
}
