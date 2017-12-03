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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColorTriangle that = (ColorTriangle) o;

        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color;
        return result;
    }

    @Override
    public String toString() {
        return "ColorTriangle{" +
                "color=" + color +
                "} " + super.toString();
    }
}
