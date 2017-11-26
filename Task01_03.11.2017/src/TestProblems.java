/**
 * Created by Sanko on 25.11.17.
 */
public class TestProblems {

    public static void main(String[] args) {

        int arrLengthRows = 5;
        int arrLengthColumns = 10;
        int[] myArray;
        int[][] myMatrix;

        myArray = Service.createArray(arrLengthRows);
        System.out.println("\n Новый одномерный НЕсортированный массив");
        Service.print(myArray);

        System.out.println("\n Отсортированный массив методом Вставки");
        Service.sortInsertionInc(myArray);
        Service.print(myArray);

        System.out.println("\n Отсортированный массив методом Вставки");
        Service.sortInsertionDec(myArray);
        Service.print(myArray);

        System.out.println("\n Отсортированный массив согласно Task 01");
        Problem_1 problem_1 = new Problem_1();
        myArray = Service.createArray(arrLengthRows);
        myArray = problem_1.sortProblem1(myArray);
        Service.print(myArray);

        System.out.println("\n Отсортированный массив согласно Task 02");
        Problem_2 problem_2 = new Problem_2();
        myArray = Service.createArray(arrLengthRows);
        myArray = problem_2.sortProblem2(myArray);
        Service.print(myArray);

        System.out.println("\n Отсортированный массив согласно Task 03");
        Problem_3 problem_3 = new Problem_3();
        myMatrix= Service.createArray(arrLengthRows, arrLengthColumns);
        myMatrix = problem_3.sortProblem3(myMatrix);
        Service.print(myMatrix);

        System.out.println("\n Отсортированный массив согласно Task 04");
        Problem_4 problem_4 = new Problem_4();
        myMatrix = Service.createArray(arrLengthRows, arrLengthColumns);
        myMatrix = problem_4.sortProblem4(myMatrix);
        Service.print(myMatrix);

        System.out.println("\n Выведение матрицы согласно Task 05");
        Problem_5 problem_5 = new Problem_5();
        arrLengthRows = 5;
        myMatrix = problem_5.createSquareMatrix(arrLengthRows);
        System.out.println("Квадратная матрица:");
        Service.print(myMatrix);
        problem_5.printProblem5(arrLengthRows);


    }
}
