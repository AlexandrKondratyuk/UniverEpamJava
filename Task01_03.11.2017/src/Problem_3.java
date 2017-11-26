/**
 * @author Aleksandr Kondratyuk
 *         <p>
 *         Дана целочисленная прямоугольная матрица.
 *         3. Упорядочить столбцы по убыванию среднего значения.
 */
public class Problem_3 {

    public int[][] sortProblem3(int[][] myMatrix) {

        int rowsOfMatrix = myMatrix.length;
        int columnsOfMatrix = myMatrix[0].length;

        /**
         * @param findAvarageFromMatrixsColumns - Создаем двумерную матрицу, где
         * - первая колонка местит средние значения столбцов
         * - вторая колонка местит индексы колонок
         * @param sum - временная переменная для хранения суммы значений столбца
         */
        int[][] findAvarageFromMatrixsColumns = new int[columnsOfMatrix][2];
        int sum = 0;

        for (int i = 0; i < columnsOfMatrix; i++) {
            for (int j = 0; j < rowsOfMatrix; j++) {
                sum += myMatrix[j][i];
            }
            findAvarageFromMatrixsColumns[i][0] = sum / rowsOfMatrix;
            findAvarageFromMatrixsColumns[i][1] = i;
            sum = 0;
        }

        /**
         * Сортировка двумерного массива по возрастанию
         */
        findAvarageFromMatrixsColumns = Service.sortInsertionMatrixInc(findAvarageFromMatrixsColumns);


        /**
         * Создание временной матрицы, в которую помещаются столбцы исходя из значений индексов матрицы средних значений
         *
         * @param newSortedMatrix - новая временная матрица для записи отсортированных столбцов
         */
        int[][] newSortedMatrix = new int[rowsOfMatrix][columnsOfMatrix];
        for (int i = 0; i < rowsOfMatrix; i++) {
            for (int j = 0; j < columnsOfMatrix; j++) {
                newSortedMatrix[i][j] = myMatrix[i][findAvarageFromMatrixsColumns[j][1]];
            }
        }
        myMatrix = newSortedMatrix;

        return myMatrix;
    }
}
