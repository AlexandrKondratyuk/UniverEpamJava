package ua.sankoniks;

import ua.sankoniks.entities.*;
import ua.sankoniks.factory.AbstractFactory;
import ua.sankoniks.factory.Factory;
import ua.sankoniks.utility.Figure;
import ua.sankoniks.utility.Service;
import ua.sankoniks.utility.TypeOfFigure;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("1. создать последовательность из фигур  используя фабрики цветных и нецветных фигур.");
        System.out.println("2. получить масивы цветных и не цветных и сколько каждых фигур в нем присутсвует");
        System.out.println("3. групируем в масивах фигуры");
        System.out.println("4. тестируем методы фигур" + "\n");

        AbstractFactory factory = new Factory();
        List<Figure> figures = factory.factoryMethodRandomFigure(20);
        System.out.println(figures);

        Service service = new Service(figures);
        List<Figure> colored = service.divideByColored(figures);
        List<Figure> notColored = service.divideByNotColored(figures);

        System.out.println("\nColoredList ///" + colored.toString());
        System.out.println("\nNot ColoredList///" + notColored.toString());

    }
}
