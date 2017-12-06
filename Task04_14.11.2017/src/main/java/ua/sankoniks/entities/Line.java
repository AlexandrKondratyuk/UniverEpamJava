package ua.sankoniks.entities;

import ua.sankoniks.utility.*;

import java.io.Serializable;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания базового класса Line, который использует за основу класс Point
 */


public class Line extends Figure implements Serializable {
    private Point beg;
    private Point end;

    public Line() {
        super();
    }

    public Line(Point beg, Point end) {
        super();
        this.beg = beg;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        super();
        this.beg = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getBeg() {
        return beg;
    }

    public void setBeg(Point beg) {
        this.beg = beg;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (beg != null ? !beg.equals(line.beg) : line.beg != null) return false;
        return end != null ? end.equals(line.end) : line.end == null;
    }

    @Override
    public int hashCode() {
        int result = beg != null ? beg.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Line{" + "beg=" + beg + ", end=" + end + '}';
    }
}

