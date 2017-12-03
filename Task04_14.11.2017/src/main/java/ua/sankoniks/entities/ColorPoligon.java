package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

/**
 * Created by Sanko on 28.11.17.
 */
public class ColorPoligon extends Poligon implements Colored {

    private int color;

    public ColorPoligon(ColorPoint[] arrColorPoints, int color) {
        super(arrColorPoints);
        this.color = color;
    }

//    public ColorPoligon(Point[] arrPoints, int color) {
//        super(arrPoints);
//        this.color = color;
//    }

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

        ColorPoligon that = (ColorPoligon) o;

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
        return "ColorPoligon{" +
                "color=" + color +
                "} " + super.toString();
    }
}
