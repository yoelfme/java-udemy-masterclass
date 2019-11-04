package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean entered = false;

        while (true) {
            System.out.print("Enter number: ");

            boolean hasInt = scanner.hasNextInt();

            if (!hasInt) {
                break;
            }

            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

            scanner.nextLine(); // to manage the <Enter> key
            entered = true;

        }

        if (entered) {
            System.out.println("Your min number is: " + min);
            System.out.println("Your max number is: " + max);
        }

        scanner.close();
    }
}
