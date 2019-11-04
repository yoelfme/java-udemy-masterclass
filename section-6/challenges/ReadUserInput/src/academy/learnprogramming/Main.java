package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private final static int LIMIT_NUMBERS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < LIMIT_NUMBERS) {
            System.out.print("Enter number " + (counter + 1) + ": ");

            boolean hasInt = scanner.hasNextInt();

            if (hasInt) {
                sum += scanner.nextInt();
                counter++;

            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // to handle enter for numeric inputs
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
