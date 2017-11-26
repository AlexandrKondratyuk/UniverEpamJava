/**
 * @author Aleksandr Kondratyuk
 *         <p>
 *         В одномерном массиве сначала положительные потом отрицательные за О(n).
 */
public class Problem_2 {

    /**
     * @param myArr - одномерный несортированный массив
     * @return - отсортированный массив согласно Второму заданию
     */
    public int[] sortProblem2(int[] myArr) {

        /**
         * @param temp - временная переменная для хранения значения масива для перемещения
         * @param index - переменная для хранения верхнего значения индекса массива, выше которых значения уже проверенные
         */
        int temp;
        int index = myArr.length - 1;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < 0 && i < index) {
                continue;
            } else {
                for (int j = index; j > i; j--) {
                    if (myArr[j] > 0) {
                        continue;
                    } else {
                        temp = myArr[j];
                        myArr[j] = myArr[i];
                        myArr[i] = temp;
                        index = j;
                        break;
                    }
                }
            }
        }
        return myArr;
    }
}
