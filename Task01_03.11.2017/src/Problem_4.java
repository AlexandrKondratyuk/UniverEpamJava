/**
 * @author Aleksandr Kondratyuk
 *         <p>
 *         4. Дана целочисленная прямоугольная матрица. Упорядочить строки, по возрастанию по самой длинной серии одинаковых элементов.
 */
public class Problem_4 {

    public int[][] sortProblem4(int[][] myMatrix) {

        int rowsOfMatrix = myMatrix.length;
        int columnsOfMatrix = myMatrix[0].length;

        int[][] findRepeatedSeriesFromRows = new int[rowsOfMatrix][2];
        int countSeriesCurrent = 1;
        int countSeriesMax = 1;
        int currentNumber = 0;

        /**
         * Сначала ищем наибольшую серию повторений в каждой строчк и записываем в новую матрицу
         */
        for (int i = 0; i < rowsOfMatrix; i++) {
            currentNumber = myMatrix[i][0];
            for (int j = 0; j < columnsOfMatrix - 1; j++) {
                if (myMatrix[i][j + 1] == currentNumber) {
                    ++countSeriesCurrent;
                    continue;
                } else {
                    currentNumber = myMatrix[i][j + 1];
                    if (countSeriesCurrent > countSeriesMax) {
                        countSeriesMax = countSeriesCurrent;
                        countSeriesCurrent = 1;
                    }
                }
            }
            findRepeatedSeriesFromRows[i][0] = countSeriesMax;
            findRepeatedSeriesFromRows[i][1] = i;
            countSeriesCurrent = 1;
            countSeriesMax = 1;
        }

        /**
         * Сортировка двумерного массива по возрастанию серии повторений чисел в матрице
         */
        findRepeatedSeriesFromRows = Service.sortInsertionMatrixInc(findRepeatedSeriesFromRows);

        /**
         * Создание временной матрицы, в которую помещаются столбцы исходя из значений индексов матрицы findRepeatedSeriesFromRows,
         * в которой отсортированы значения по возростанию серий повторений
         *
         * @param newSortedMatrix - новая временная матрица для записи отсортированных строк по возрастанию
         */
        int[][] newSortedMatrix = new int[rowsOfMatrix][columnsOfMatrix];
        for (int i = 0; i < rowsOfMatrix; i++) {
            for (int j = 0; j < columnsOfMatrix; j++) {
                newSortedMatrix[i][j] = myMatrix[findRepeatedSeriesFromRows[i][1]][j];
            }
        }
        myMatrix = newSortedMatrix;


        return myMatrix;
    }

}
