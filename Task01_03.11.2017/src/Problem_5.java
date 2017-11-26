/**
 * @author Aleksandr Kondratyuk
 *         <p>
 *         5. Дана квадратная матрица A порядка M (M — нечетное число). Начи ная с элемента A1,1
 *         и перемещаясь по часовой стрелке, вывести все ее элементы по спирали:
 *         первая строка, последний столбец, последняя строка в обратном  порядке,
 *         первый  столбец  в  обратном  порядке,  оставшиеся  элементы второй строки и т. д.;
 *         последним выводится центральный элемент  матрицы.
 */
public class Problem_5 {

    private int[][] mySquareMatrix;

    public void printProblem5(int lengthOfMatrix) {

        /**
         * Для удобства проверки результата сначала создадим квадратную матрицу с заполнением значений по возрастанию
         *
         * @param j - индекс для счета столбцов
         * @param index - вспомагательный индекс для счета строк
         */
        mySquareMatrix = createSquareMatrix(lengthOfMatrix);
        int j = 0;
        int index;

        /**
         * Главный цыкла для пробежки по всей матрице
         */
        for (int i = 0; i < lengthOfMatrix - i; ) {

            /**
             * Прорисовка матрицы слева-на-право
             */
            while (j < lengthOfMatrix - i) {
                System.out.print(mySquareMatrix[i][j++] + " : ");


                /**
                 * Прорисовка матрицы сверху-в-низ
                 */
                if (j == lengthOfMatrix - i) {
                    for (int down = i + 1; down < j; ) {
                        System.out.print(mySquareMatrix[down++][j - 1] + " : ");
                    }
                }
            }
            j--;
            index = j;

            /**
             * Прорисовка матрицы справа-на-лево
             */
            while (j > i) {
                System.out.print(mySquareMatrix[index][--j] + " : ");
            }
            index--;

            /**
             * Прорисовка матрицы снизу-в-верх
             */
            while (index > i) {
                System.out.print(mySquareMatrix[index--][j] + " : ");
            }

            i++;
            j++;
        }
    }

    /**
     * Метод для создания квадратной матрицы заполненой значениями по возростанию от 1 до (n * n)
     *
     * @param lengthOfMatrix - длина строк и столбцов матрицы
     * @return двумерную матрицу, заполненную значениями по возростанию
     */
    public int[][] createSquareMatrix(int lengthOfMatrix) {

        mySquareMatrix = new int[lengthOfMatrix][lengthOfMatrix];
        int count = 0;

        for (int i = 0; i < lengthOfMatrix; i++) {
            for (int j = 0; j < lengthOfMatrix; j++) {
                mySquareMatrix[i][j] = ++count;
            }
        }
        return mySquareMatrix;
    }
}
