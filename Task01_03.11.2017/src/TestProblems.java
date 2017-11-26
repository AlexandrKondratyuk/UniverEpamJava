/**
 * Created by Sanko on 25.11.17.
 */
public class TestProblems {

    public static void main(String[] args) {

        int arrLength = 3;
        int arrLengthColumns = 5;
        int[] myArray;
        int[][] myMatrix;

        myArray = Service.createArray(arrLength);
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
        myArray = Service.createArray(arrLength);
        myArray = problem_1.sortProblem1(myArray);
        Service.print(myArray);

        System.out.println("\n Отсортированный массив согласно Task 02");
        Problem_2 problem_2 = new Problem_2();
        myArray = Service.createArray(arrLength);
        myArray = problem_2.sortProblem2(myArray);
        Service.print(myArray);

        System.out.println("\n Отсортированный массив согласно Task 03");
        Problem_3 problem_3 = new Problem_3();
        myMatrix= Service.createArray(arrLength, arrLengthColumns);
        myMatrix = problem_3.sortProblem3(myMatrix);
        Service.print(myMatrix);

    }
}
