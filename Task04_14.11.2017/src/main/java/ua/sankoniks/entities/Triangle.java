package ua.sankoniks.entities;

import ua.sankoniks.utility.*;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса Triangle для создания сущностей Треугольник
 */
public class Triangle extends Figure{

    private Point apexA, apexB, apexC;
    private Line sideAB, sideBC, sideAC;

    public Triangle() {
        super();
    }

    public Triangle(Point apexA, Point apexB, Point apexC) {
        super();
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
    }

    public Triangle(Line sideAB, Line sideBC, Line sideAC) {
        super();
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideAC = sideAC;
    }

    public Point getApexA() {
        return apexA;
    }

    public void setApexA(Point apexA) {
        this.apexA=apexA;
        sideAB=null;
        sideAC=null;
    }

    public Point getApexB() {
        return apexB;
    }

    public void setApexB(Point apexB) {
        this.apexB = apexB;
        sideAB = null;
        sideBC = null;
    }

    public Point getApexC() {
        return apexC;
    }

    public void setApexC(Point apexC) {
        this.apexC = apexC;
        sideBC = null;
        sideAC = null;
    }

    public Line getSideAB() {
        if (sideAB==null) sideAB = new Line(apexA, apexB);
        return sideAB;
    }

    public void setSideAB(Line sideAB) {
        this.sideAB = sideAB;
    }

    public Line getSideBC() {
        if (sideBC==null) sideBC = new Line(apexB, apexC);
        return sideBC;
    }

    public void setSideBC(Line sideBC) {
        this.sideBC = sideBC;
    }

    public Line getSideAC() {
        if (sideAC==null) sideAC = new Line(apexA, apexC);
        return sideAC;
    }

    public void setSideAC(Line sideAC) {
        this.sideAC = sideAC;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "apexA=" + apexA +
                ", apexB=" + apexB +
                ", apexC=" + apexC +
                '}';
    }
}
