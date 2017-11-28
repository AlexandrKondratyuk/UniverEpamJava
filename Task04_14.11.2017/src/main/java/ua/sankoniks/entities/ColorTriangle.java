package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

/**
 * Created by Sanko on 28.11.17.
 */
public class ColorTriangle extends Triangle implements Colored {

    private int color;

    public ColorTriangle() {
        super();
    }

    public ColorTriangle(int color) {
        super();
        this.color = color;
    }

    public ColorTriangle(Point apexA, Point apexB, Point apexC, int color) {
        super(apexA, apexB, apexC);
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
        return "ColorTriangle{" +
                "color=" + color +
                "} " + super.toString();
    }
}
