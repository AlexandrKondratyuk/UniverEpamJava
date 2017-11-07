/**
 * @author Alexandr Kondratyuk
 */
public class CRUD_Array {

    private int[] arr;


    public CRUD_Array() {
    }

    public CRUD_Array(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    /**
     * Method for creating array using random numbers from -50 to 50
     * @param lengthOfArray - length of our array
     * @return random array between -50 and +50
     */
    public int[] createArray(int lengthOfArray) {

        arr = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++)
            arr[i] = (int) (Math.random() * 101) - 51;
        return arr;
    }


    /**
     * Method sorting array by INSERTION SORT
     */
    public int[] sortInsertion (int[] arr) {

        int key = 0;
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                key = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
            }
            while (j > 0 && key < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
        return arr;
    }
}
