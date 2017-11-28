package ua.sankoniks.factory;

import ua.sankoniks.entities.*;
import ua.sankoniks.utility.Figure;
import ua.sankoniks.utility.TypeOfFigure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanko on 28.11.17.
 */
public class Factory extends AbstractFactory {
    public Factory() {
        super();
    }

    public Point createPoint(int x, int y) {
        return new Point(x, y);
    }

    public ColorPoint createColorPoint(int x, int y, int color) {
        return new ColorPoint(x, y, color);
    }

    public Line createLine(Point start, Point end) {
        return new Line(start, end);
    }

    public ColorLine createColorLine(Point start, Point end, int color) {
        return new ColorLine(start, end, color);
    }

    public Triangle createTriangle(Point a, Point b, Point c) {
        return new Triangle(a, b, c);
    }

    public ColorTriangle createColorTriangle(Point a, Point b, Point c, int color) {
        return new ColorTriangle(a, b, c, color);
    }

    public Poligon createPoligon(Point[] arrPoints) {
        return new Poligon(arrPoints);
    }

    public ColorPoligon createColorPoligon(Point[] arrPoints, int color) {
        return new ColorPoligon(arrPoints, color);
    }

    /**
     * @return возвращает указанное количество случайных фигур (точек
     */
    public List<Figure> factoryMethodRandomFigure(int numbersOfFigures) {

        List<Figure> listOfFIgures = new ArrayList<Figure>(numbersOfFigures);
        String typeOfFigure;


        for (int i = 0; i < numbersOfFigures; i++) {
            typeOfFigure = TypeOfFigure.randomTypeOfFigure().getName();

            switch (typeOfFigure) {
                case "Point":
                    listOfFIgures.add(createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)));
                    break;
                case "ColorPoint":
                    listOfFIgures.add(createColorPoint((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 255)));
                    break;
                case "Line":
                    listOfFIgures.add(createLine(
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100))));
                    break;
                case "ColorLine":
                    listOfFIgures.add(createColorLine(
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            (int) (Math.random() * 255)));
                    break;
                case "Triangle":
                    listOfFIgures.add(createTriangle(
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100))));
                    break;
                case "ColorTriangle":
                    listOfFIgures.add(createColorTriangle(
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            createPoint((int) (Math.random() * 100), (int) (Math.random() * 100)),
                            (int) (Math.random() * 255)));
                case "Poligon":
                    listOfFIgures.add(createPoligon(arrPoints()));
                    break;
                case "ColorPoligon":
                    listOfFIgures.add(createColorPoligon(arrPoints(), (int) (Math.random() * 255)));
                    break;
                default:
                    return null;
            }
        }

        return listOfFIgures;
    }

    private Point[] arrPoints() {
        int numberOfPoligonsApexes = (int) ((Math.random() * 3) +3) ;
        Point[] listOfPoints = new Point[numberOfPoligonsApexes];
        for (int i = 0; i < numberOfPoligonsApexes; i++) {
            listOfPoints[i] = createPoint((int) (Math.random() * 100), (int) (Math.random() * 100));
        }
        return listOfPoints;
    }


}
