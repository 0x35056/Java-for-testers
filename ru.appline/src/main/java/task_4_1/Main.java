package task_4_1;

/**
 * Created by Maya on 09.03.2021
 */

public class Main {

    /**
     * @param array is array of random numbers
     * @return returns the index of the minimum positive number
     */

    public static int getIndexOfMinPositiveNumber(int[] array){

        int min = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0 && min > array[i])
            {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    /**
     * @param array is array of random numbers
     * @return returns the index of the maximum negative number
     */

    public static int getIndexOfMaxNegativeNumber(int[] array){

        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0 && max < array[i])
            {
                max = array[i];
                index = i;
            }
        }

        return index;
    }

    /**
     * Swaps two numbers
     * @param array is array of random numbers
     * @param indexMinPositiveNumber is the index of the minimum positive number
     * @param indexMaxNegativeNumber is the index of the maximum negative number
     */

    public static void reverse(int[] array, int indexMinPositiveNumber, int indexMaxNegativeNumber) {

        int temp = array[indexMinPositiveNumber];
        array[indexMinPositiveNumber] = array[indexMaxNegativeNumber];
        array[indexMaxNegativeNumber] = temp;
    }

    public static void main(String[] args) {

        int[] array = new int[20];
        int min = -10;
        int max = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }

        System.out.print("Old array: ");

        for (int i: array) {
            System.out.print(i + " ");
        }

        int indexMinPositiveNumber = getIndexOfMinPositiveNumber(array);
        int indexMaxNegativeNumber = getIndexOfMaxNegativeNumber(array);

        System.out.println("\nMin positive number index: " + indexMinPositiveNumber);
        System.out.println("Max negative number index: " + indexMaxNegativeNumber);

        reverse(array, indexMinPositiveNumber, indexMaxNegativeNumber);

        System.out.print("New array: ");

        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
