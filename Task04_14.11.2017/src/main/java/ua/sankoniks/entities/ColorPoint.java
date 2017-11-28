package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса ColorPoint, который наследуется от Point с добавлением нового параметра color
 */

public class ColorPoint extends Point implements Colored {
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
    public String toString() {
        return  "ColorPoint [color=" + getColor() + ", X=" + getX() + ", Y=" + getY() + "]";
    }
}

