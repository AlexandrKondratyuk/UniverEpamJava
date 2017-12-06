package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

import java.io.Serializable;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса ColorPoint, который наследуется от Point с добавлением нового параметра color
 */

public class ColorPoint extends Point implements Colored, Serializable {
    private int color;

    public ColorPoint(int x, int y, int color) {
        super(x, y);
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

        ColorPoint that = (ColorPoint) o;

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
        return  "ColorPoint [color=" + getColor() + ", X=" + getX() + ", Y=" + getY() + "]";
    }
}

