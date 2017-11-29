package ua.sankoniks.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Сервисный класс для импдементации логики
 */
public class Service {

    private List<Figure> figures;
    private Figure[] arrFigures;
    private int countColored;

    public int getCountColored() {
        return countColored;
    }

    public void setCountColored(int countColored) {
        this.countColored = countColored;
    }

    public int getCountNotColored() {
        return countNotColored;
    }

    public void setCountNotColored(int countNotColored) {
        this.countNotColored = countNotColored;
    }

    private int countNotColored;

    private List<Figure> coloredFigures = new ArrayList<>();
    private List<Figure> notColoredFigures = new ArrayList<>();
    private int numberOfColoredFigures;
    private int numberOfNotColoredFigures;

    public Service(List<Figure> figures) {
        this.figures = figures;
    }

    /**
     * метод отбора цветных фигур
     *
     * @param figures - Неотсортированный список фигур
     * @return список цветных фигур
     */
    public List<Figure> divideByColored(List<Figure> figures) {
        this.figures = figures;
        countColored = 0;

        for (Figure fig : figures) {
            if (fig instanceof Colored) {
                coloredFigures.add(fig);
//                System.out.println("Colored Figure --> " + fig.toString());
                ++countColored;
            } else continue;
        }
        return coloredFigures;
    }

    /**
     * метод отбора НЕ цветных фигур
     *
     * @param figures - Неотсортированный список фигур
     * @return список НЕ цветных фигур
     */
    public List<Figure> divideByNotColored(List<Figure> figures) {
        this.figures = figures;
        countNotColored = 0;

        for (Figure fig : figures) {
            if (!(fig instanceof Colored)) {
                notColoredFigures.add(fig);
//                System.out.println("NOT Colored Figure --> " + fig.toString());
                ++countNotColored;
            } else continue;
        }
        return notColoredFigures;
    }

    /**
     * Метод для подсчета разных фигур
     * @param listFigures - текущий список фигур
     * @return - МАР, где ключ - название типа фигуры, значение - количество фиуг
     */
    public Map<String, Integer> counterOfFigures(List<Figure> listFigures) {
        figures = listFigures;
        List<TypeOfFigure> listTypeOfFigures = TypeOfFigure.getVALUES();
        String[] arrTypes = new String[8];

        for (int i = 0; i < listTypeOfFigures.size(); i++)
            arrTypes[i] = listTypeOfFigures.get(i).getName();

        Map<String, Integer> counterMap = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < arrTypes.length; i++) {
            counter = 0;
            for (int j = 0; j < listFigures.size(); j++) {
                if (listFigures.get(j).getClass().getSimpleName().toString().equals(arrTypes[i])) {
                    ++counter;
                }
            }
            counterMap.put(arrTypes[i], counter);
        }
        return counterMap;
    }



    public List<Figure> sortFigures(List<Figure> listFigures) {
        figures = new ArrayList<>(listFigures.size());
        List<TypeOfFigure> listTypeOfFigures = TypeOfFigure.getVALUES();
        String[] arrTypes = new String[8];

        for (int i = 0; i < listTypeOfFigures.size(); i++)
            arrTypes[i] = listTypeOfFigures.get(i).getName();

        for (int i = 0; i < arrTypes.length; i++) {
            for (int j = 0; j < listFigures.size(); j++) {
                if (listFigures.get(j).getClass().getSimpleName().toString().equals(arrTypes[i])) {
                    figures.add(listFigures.get(j));
                }
            }

        }
        return figures;
    }

    /**
     * метод для выведения в консоль фигур со списка
     *
     * @param list любой список фигур
     */
    public void printList(List<Figure> list) {
        for (Figure figure : list) {
            System.out.println(figure.toString());
        }
    }

    public void printMap(Map<String, Integer> map) {
        System.out.println("Счетчик фигур");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }
    }

    public int compareTo(Figure figure) {
        return this.getClass().getSimpleName().compareTo(figure.getClass().getSimpleName());
    }
}
