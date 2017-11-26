/**
 * Created by Sanko on 25.11.17.
 */
public class Service {

    /**
     * Метод для создания одномерного массива
     * Значения массива случайные от -50 до +50
     *
     * @param lengthOfArray - длина массива? который создаем
     * @return массив? наполненный случайными числами от -50 до +50
     */
    public static int[] createArray(int lengthOfArray) {
        int[] myArr = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++)
            myArr[i] = (int) (Math.random() * 101) - 51;

        return myArr;
    }


    /**
     * Метод для создания двумерного массива наполняя случайными числами от -50 до 50
     *
     * @param lengthOfArray1 - колличество строк в массиве
     * @param lengthOfArray2 - количество столбцов в массиве
     * @return двумерный массив, который заполнен случайными числами
     */
    public static int[][] createArray(int lengthOfArray1, int lengthOfArray2) {

        int[][] myArrMatrix = new int[lengthOfArray1][lengthOfArray2];

        for (int i = 0; i < lengthOfArray1; i++) {
            for (int k = 0; k < lengthOfArray2; k++)
                myArrMatrix[i][k] = (int) (Math.random() * 101) - 51;
        }
        return myArrMatrix;
    }

    /**
     * Метод для сортировки массива методом Вставки по возростанию значений
     *
     * @param arr - массив, который необходимо отсортировать
     * @return - отсортированный по возрастанию массив методом Вставки
     */
    public static int[] sortInsertionInc(int[] arr) {

        int key = 0;
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                key = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
            }
            while (j > 0 && key < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
        return arr;
    }

    /**
     * Метод для сортировки массива методом Вставки по убыванию значений
     *
     * @param arr - массив, который необходимо отсортировать
     * @return - отсортированный по убыванию массив методом Вставки
     */
    public static int[] sortInsertionDec(int[] arr) {

        int key = 0;
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                key = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
            }
            while (j > 0 && key > arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
        return arr;
    }

    /**
     * Метод для сортировки двумерного массива методом Вставки по возростанию значений
     *
     * @param arr - массив, который необходимо отсортировать
     * @return - отсортированный по возрастанию массив методом Вставки
     */
    public static int[][] sortInsertionMatrixInc(int[][] arr) {

        int keyValue = 0;
        int keyIndex = 0;
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][0] > arr[i + 1][0]) {
                keyValue = arr[i + 1][0];
                keyIndex = arr[i + 1][1];
                arr[i + 1][0] = arr[i][0];
                arr[i + 1][1] = arr[i][1];
                j = i;
            }
            while (j > 0 && keyValue < arr[j - 1][0]) {
                arr[j][0] = arr[j - 1][0];
                arr[j][1] = arr[j - 1][1];
                j--;
            }
            arr[j][0] = keyValue;
            arr[j][1] = keyIndex;
        }
        return arr;
    }

    /**
     * Метод для печати одномерного массива в консоль
     *
     * @param arr - одномерный массив для печати
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.print("\n");

    }

    /**
     * Метод для печати двумерного массива в консоль
     *
     * @param arr - двумерный массив для выведения в консоль
     */
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
        }

    }


}
