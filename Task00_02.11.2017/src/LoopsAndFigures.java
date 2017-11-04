/**
 *
 * @author Aleksandr Kondratyuk
 *
 *
 * Created by Aleksandr Kondratyuk on 01.11.17.
 *
 * TASK:
 * Используя циклы и метод:
 * System.out.print("* "), System.out.print("  "),
 * System.out.print("\n")
 * (для перехода на новую строку).
 * Выведите на экран:
 * · прямоугольник
 * · прямоугольный треугольник
 * · равносторонний треугольник
 * · ромб
 *
 */
public class LoopsAndFigures {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 5;


        // Выведем на экран прямоугольник с сторонами X и Y
        System.out.print("Прямоугольник со стороноами " + x + " и " + y + "\n\n");
        rectangle(x, y);

        // Выведем на экран прямоугольный треугольник с сторонами X и Y
        System.out.print("\n\n Прямоугольный треугольник  со стороноами " + x + " и " + x + "\n\n");
        rightTriangle(x);


        // Выведем на экран равносторонний треугольник
        System.out.print("\n\n Равносторонний треугольник \n\n");
        equilateralTriangle(z);

        // Выведем на экран ромб с сторонами Z
        System.out.print("\n\n Ромб \n\n");
        diamond(z);
    }

    /**
     * метод для выведения "двойного пробела"
     */
    public static void printAsterisk() {
        System.out.print("* ");
    }

    /**
     * метод для выведения "звездочки + пробела"
     */
    public static void printSpace() {
        System.out.print("  ");
    }

    /**
     * метод для перехода на следующую строчку
     */
    public static void newLine() {
        System.out.print("\n");
    }

    /**
     * метод для печати Прямоугольника
     *
     * @param x - length of rectangle
     * @param y - width of rectangle
     */
    private static void rectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || i == x - 1) {
                    printAsterisk();
                } else if (j == 0 || j == y - 1) {
                    printAsterisk();
                } else {
                    printSpace();
                }
            }
            newLine();
        }
    }

    /** метод для печати Прямоугольного треугольника
     *
     * @param x - length and width of right triangle
     */
    private static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j || i == x - 1 || j == 0) {
                    printAsterisk();
                } else {
                    printSpace();
                }
            }
            newLine();
        }
    }

    /** метод для печати Равностороннего треугольника
     *
     * @param middleOfTriangle - indicates the middle of the side
     *
     */
    private static void equilateralTriangle(int middleOfTriangle) {
        int x = 0;

        while(x < middleOfTriangle){
            /**
             * прорисовка пробелов до треугольника
             */
            for (int i = 0; i < middleOfTriangle-x; i++) {
                System.out.print("  ");
            }

            /**прорисовка треугольника звездочками
             */
            for (int i = 0; i < x*2 + 1; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            System.out.print("\n");
            x++;
        }

    }

    /**
     * метод для печати ромба
     *
     * @param middleOfDiamond
     */
    public static void diamond (int middleOfDiamond) {

        /**
         * рисуем верхнюю часть ромба
         */
        equilateralTriangle(middleOfDiamond);

        /**
         * рисуем нижнюю часть ромба
         */
        int x = 0;
        x = middleOfDiamond;
        while(x >= 0){
            /**
             * прорисовка пробелов
             */
            for (int i = 0; i < middleOfDiamond-x; i++) {
                System.out.print("  ");
            }

            /**
             * прорисовка звездочками
             */
            for (int i = 0; i < x*2 + 1; i++) {
                System.out.print("* ");
            }
            System.out.print("\n\n");
            x--;
        }
    }

}
