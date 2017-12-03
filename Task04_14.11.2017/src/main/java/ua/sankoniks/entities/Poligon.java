package ua.sankoniks.entities;

import ua.sankoniks.utility.*;

import java.util.Arrays;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса Poligon, который использует за основу класс Point
 */
public class Poligon extends Figure {

    private Point[] arrPoints;

    public Poligon(Point[] arrPoints) {
        super();
        this.arrPoints = arrPoints;
    }

    public Point[] getArrPoints() {
        return arrPoints;
    }

    public void setArrPoints(Point[] arrPoints) {
        this.arrPoints = arrPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Poligon poligon = (Poligon) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(arrPoints, poligon.arrPoints);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrPoints);
    }

    @Override
    public String toString() {
        return "Poligon{" + "arrPoints=" + Arrays.toString(arrPoints) +
                '}';
    }
}
