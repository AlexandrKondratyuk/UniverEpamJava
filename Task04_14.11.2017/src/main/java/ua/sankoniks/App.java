package ua.sankoniks;

import ua.sankoniks.factory.AbstractFactory;
import ua.sankoniks.factory.Factory;
import ua.sankoniks.utility.*;

import java.io.*;
import java.util.*;

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
        List<Figure> figures = factory.factoryMethodRandomFigure(10);
        System.out.println(figures);

        Service service = new Service(figures);
        List<Figure> colored = service.divideByColored(figures);
        List<Figure> notColored = service.divideByNotColored(figures);

//        System.out.println("\nColoredList ///" + colored.toString());
//        System.out.println("\nNot ColoredList///" + notColored.toString());

        System.out.println("\n");
        Map<String, Integer> counterOfFigures = new HashMap<String, Integer>();
        counterOfFigures = service.counterOfFigures(figures);
        service.printMap(counterOfFigures);
        System.out.println("Number of colored figure is - " + service.getCountColored());
        System.out.println("Number of NOT colored figure is - " + service.getCountNotColored());

        System.out.println("\n Сортировка списка фигур");
        figures = service.sortFigures(figures);
        service.printList(figures);


        /**
         * Блок записи в файл списка объектов
         */
        System.out.println("Старт блока записи данных в файл");
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("figures.dat")));
            oos.writeObject(figures);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * Блок чтения данных списка фигур с файла
         */
        System.out.println("Старт блока чтения данных с файла");
        ObjectInputStream ois = null;
        List<Figure> figuresFromFile = null;

        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("figures.dat")));
            figuresFromFile = (List<Figure>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        /**
         * Выведение списка фигур, прочитанных с файла в консоль
         */
        System.out.println("Старт блока выведения данных с файла в консоль");
        service.printList(figuresFromFile);


        /**
         * Проверка - правильно ли считался файл и есть ли объекты эквивалентны
         */
        boolean isEquals = false;
        if (figuresFromFile.equals(figures)) {
            isEquals = true;
            System.out.println("figuresFromFile equals  figures");
        } else {
            isEquals = false;
            System.out.println("figuresFromFile NOT equals  figures");
        }

        System.out.println();


    }
}
