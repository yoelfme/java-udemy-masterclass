package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] numbers = readIntegers(5);
	    int minimum = findMin(numbers);

        System.out.println("Minimum number from " + Arrays.toString(numbers) + " is " + minimum);
    }

    private static int[] readIntegers(int count) {
        int[] numbers = new int[count];

        System.out.println("Enter " + count + " numbers:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}
