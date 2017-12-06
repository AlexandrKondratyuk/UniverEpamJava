package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

import java.io.Serializable;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса ColorLine, который наследуется от Line с добавлением нового параметра color
 */

public class ColorLine extends Line implements Colored, Serializable {

    /**
     * @param color - цвет линии
     */
    private int color;

    public ColorLine(Point beg, Point end, int color) {
        super(beg, end);
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

        ColorLine colorLine = (ColorLine) o;

        return color == colorLine.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color;
        return result;
    }

    @Override
    public String toString() {
        return "ColorLine [color=" + color + ", Beg = " + getBeg() + ", End =" + getEnd() + "]";
    }

}

