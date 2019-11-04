package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = new int[] {1, 2, 3, 4, 5};

        System.out.println("my original array: " + Arrays.toString(myArray));

        reverse(myArray);

        System.out.println("my reversed array: " + Arrays.toString(myArray));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];

            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
