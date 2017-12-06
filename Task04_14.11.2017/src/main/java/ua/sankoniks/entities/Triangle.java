package ua.sankoniks.entities;

import ua.sankoniks.utility.*;

import java.io.Serializable;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса Triangle для создания сущностей Треугольник
 */
public class Triangle extends Figure implements Serializable{

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (apexA != null ? !apexA.equals(triangle.apexA) : triangle.apexA != null) return false;
        if (apexB != null ? !apexB.equals(triangle.apexB) : triangle.apexB != null) return false;
        if (apexC != null ? !apexC.equals(triangle.apexC) : triangle.apexC != null) return false;
        if (sideAB != null ? !sideAB.equals(triangle.sideAB) : triangle.sideAB != null) return false;
        if (sideBC != null ? !sideBC.equals(triangle.sideBC) : triangle.sideBC != null) return false;
        return sideAC != null ? sideAC.equals(triangle.sideAC) : triangle.sideAC == null;
    }

    @Override
    public int hashCode() {
        int result = apexA != null ? apexA.hashCode() : 0;
        result = 31 * result + (apexB != null ? apexB.hashCode() : 0);
        result = 31 * result + (apexC != null ? apexC.hashCode() : 0);
        result = 31 * result + (sideAB != null ? sideAB.hashCode() : 0);
        result = 31 * result + (sideBC != null ? sideBC.hashCode() : 0);
        result = 31 * result + (sideAC != null ? sideAC.hashCode() : 0);
        return result;
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
