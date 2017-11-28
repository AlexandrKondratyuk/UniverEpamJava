package ua.sankoniks.factory;

import ua.sankoniks.entities.*;
import ua.sankoniks.utility.Figure;

import java.util.List;

/**
 * Created by Sanko on 28.11.17.
 */
public abstract class AbstractFactory {

    public abstract Point createPoint(int x, int y);
    public abstract ColorPoint createColorPoint(int x, int y, int color);
    public abstract Line createLine(Point start, Point end);
    public abstract ColorLine createColorLine(Point start, Point end, int color);
    public abstract Triangle createTriangle (Point a, Point b, Point c);
    public abstract ColorTriangle createColorTriangle (Point a, Point b, Point c, int color);
    public abstract Poligon createPoligon (Point[] arrPoints);
    public abstract ColorPoligon createColorPoligon (Point[] arrPoints, int color);

    public abstract List<Figure> factoryMethodRandomFigure(int numberOfFigures);

}
