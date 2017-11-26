import java.rmi.ServerError;

/**
 * @author Alexandr Kondratyuk
 *         <p>
 *         ЗАДАНИЕ:
 *         Сортировка последовательности
 *         1. Упорядочить одномерный масиве вначале отрицательные повозрастанию
 *         затем положительные по убыванию.
 */
public class Problem_1 {


    /**
     * @param myArr - одномерный несортированный массив
     * @return - отсортированный массив согласно Первому заданию
     */
    public int[] sortProblem1(int[] myArr) {

        /**
         * Создаем новый массив, который равный длине несортированного массива
         * @param newArr - одномерный массив
         * @param count - счетчик заполненных значений в массиве
         */

        int[] newArr = new int[myArr.length];
        int count = 0;

        /**
         * Сначала сортируем по возрастанию и берем только отрицательные значения + "0" в массив
         */
        Service.sortInsertionInc(myArr);
        for (int index = 0; index < myArr.length; index++) {
            if (myArr[index] <= 0)
                newArr[count++] = myArr[index];
        }

        /**
        * Потом сортируем по убванию и берем только положительные значения в массив
        */
        Service.sortInsertionDec(myArr);
        for (int index = 0; index < myArr.length; index++) {
            if (myArr[index] > 0)
                newArr[count++] = myArr[index];
        }
        return newArr;
    }
}
