import java.util.Arrays;

/**
 * @author Aleksandr Kondratyuk
 *         <p>
 *         Сортировка последовательности
 *         1. Упорядочить одномерный масиве вначале отрицательные повозрастанию
 *         затем положительные по убыванию.
 *         2. В одномерном массиве сначала положительные потом отрицательные за О(n).
 *         <p>
 *         Дана целочисленная прямоугольная матрица.
 *         3. Упорядочить столбцы по убыванию среднего значения.
 *         4. Упорядочить строки, по возрастанию по самой длинной серии одинаковых элементов.
 *         <p>
 *         5. Дана квадратная матрица A порядка M (M — нечетное число). Начи-
 *         менты по спирали: первая строка, последний столбец, последняя строка в
 *         ная с элемента A1,1 и перемещаясь по часовой стрелке, вывести все ее эле-
 *         менты по спирали: первая строка, последний столбец, последняя строка в
 *         обратном  порядке,  первый  столбец  в  обратном  порядке,  оставшиеся  эле-
 *         менты второй строки и т. д.; последним выводится центральный элемент
 *         матрицы.
 */
public class sortArrayPart1 {

    public static void main(String[] args) {

        int arrLength = 20;
        int[] myArray;

        CRUD_Array array = new CRUD_Array();

        myArray = array.createArray(arrLength);
        System.out.println("\nNew not-sorted array");
        System.out.println(Arrays.toString(myArray));


        System.out.println("\nSorted array using Insertion sort type");
        array.sortInsertion(myArray);
        System.out.println(Arrays.toString(myArray));

        int minPositiveIndex = arrLength - 1;
        for (int i = arrLength - 1; myArray[i] > 0; i--) {
            minPositiveIndex = i;
            if (myArray[i] <= 0) break;
        }

        int temp;
        for (int i = minPositiveIndex, j = arrLength - 1; i < j; i++, j--) {
            if (myArray[i] < myArray[j]) {
                temp = myArray[j];
                myArray[j] = myArray[i];
                myArray[i] = temp;
            }
        }
        System.out.println("\nSorted array according to task 01");
        System.out.println(Arrays.toString(myArray));
    }
}
