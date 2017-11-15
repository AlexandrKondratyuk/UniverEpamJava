/**
 * @author Alexandr Kondratyuk
 */
public class CRUD_Array {

    private int[] myArr;


    public CRUD_Array() {
    }

    public CRUD_Array(int[] myArr) {
        this.myArr = myArr;
    }

    public int[] getMyArr() {
        return myArr;
    }

    /**
     * Method for creating array using random numbers from -50 to 50
     *
     * @param lengthOfArray - length of our array
     * @return random array between -50 and +50
     */
    public int[] createArray(int lengthOfArray) {

        myArr = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++)
            myArr[i] = (int) (Math.random() * 101) - 51;
        return myArr;
    }


    /**
     * Method sorting array by INSERTION SORT
     */
    public int[] sortInsertion(int[] arr) {

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
     * Method sort array in two stages:
     * at first stage in the array sorted only negative values by ascending,
     * at second stage positive part of the array sorted by descending
     */
    public int[] sortTask01(int[] myArray) {

        CRUD_Array ca = new CRUD_Array();
        ca.sortTask02(myArray);

        int key = 0;
        int j = 0;

        /**
         * first stage
         * */
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] < 0) {
                if (myArray[i] > myArray[i + 1]) {
                    key = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    j = i;
                }
                while (j > 0 && key < myArray[j - 1]) {
                    myArray[j] = myArray[j - 1];
                    j--;
                }
                myArray[j] = key;
            }
        }

        /**
         * second stage
         * */
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] < 0) {
                continue;
            } else if (myArray[i] < myArray[i + 1]) {
                key = myArray[i + 1];
                myArray[i + 1] = myArray[i];
                j = i;
            }
            while (j > 0 && key > myArray[j - 1]) {
                myArray[j] = myArray[j - 1];
                j--;
            }
            myArray[j] = key;
        }
        return myArray;
    }
    


    public int[] sortTask02(int[] arr) {
        int temp;
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && i < index) {
                continue;
            } else {
                for (int j = index; j > i; j--) {
                    if (arr[j] > 0) {
                        continue;
                    } else {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        index--;
                        break;
                    }
                }
            }
        }
        return arr;
    }


}
