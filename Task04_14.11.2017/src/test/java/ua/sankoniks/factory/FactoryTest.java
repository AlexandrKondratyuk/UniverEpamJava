package ua.sankoniks.factory;

import org.junit.jupiter.api.*;
import ua.sankoniks.entities.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sanko on 03.12.17.
 */
class FactoryTest {

    Factory factory = new Factory();


    @Test
    void createPoint() {
        Point pointExpected = new Point(5, 8);

        Point pointActual = factory.createPoint(5, 8);
        assertEquals(pointExpected, pointActual);
    }

    @Test
    void createColorpoint() {
        Point cPointExpected = new ColorPoint(3, 4, 5);

        Point cPointActual = factory.createColorPoint(3, 4, 5);
        assertEquals(cPointExpected, cPointActual);
    }

    @Test
    void createLine() {
        Line lineExpected = new Line(1, 2, 3, 4);

        Line lineActual = factory.createLine(new Point(1, 2), new Point(3, 4));
        assertEquals(lineExpected, lineActual);
    }

    @Test
    void createColorLine() {
        Line cLineExpected = new ColorLine(new Point(1, 2), new Point(3, 4), 5);

        Line cLineActive = factory.createColorLine(new Point(1, 2), new Point(3, 4), 5);
        assertEquals(cLineExpected, cLineActive);
    }

    @Test
    void createTriangle() {
        Triangle triangleExpected = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));

        Triangle triangleActual = factory.createTriangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
        assertEquals(triangleExpected, triangleActual);
    }

    @Test
    void createColorTriangle() {
        Triangle cTriangleExpected = new ColorTriangle(new Point(1, 2), new Point(3, 4), new Point(5, 6), 7);

        Triangle cTriangleActual = factory.createColorTriangle(new Point(1, 2), new Point(3, 4), new Point(5, 6), 7);
        assertEquals(cTriangleExpected, cTriangleActual);
    }

    @Test
    void createPoligon() {
        Point[] arrPoints = new Point[]{new Point(1, 2), new Point(3, 4),
                new Point(5, 6), new Point(7, 8)};
        Poligon poligonExpected = new Poligon(arrPoints);

        Poligon poligonActual = factory.createPoligon(arrPoints);
        assertEquals(poligonExpected, poligonActual);
    }

    @Test
    void createColorPoligon() {
        Point[] arrColorPoints = new ColorPoint[4];
        arrColorPoints[0] = new ColorPoint(1, 2, 33);
        arrColorPoints[1] = new ColorPoint(3, 4, 33);
        arrColorPoints[2] = new ColorPoint(5, 6, 33);
        arrColorPoints[3] = new ColorPoint(7, 8, 33);

        Poligon cPoligonExpected = new ColorPoligon((ColorPoint[]) arrColorPoints, 33);
        Poligon cPoligonActual = factory.createColorPoligon(arrColorPoints, 33);

        assertEquals(cPoligonExpected, cPoligonActual);
    }

}