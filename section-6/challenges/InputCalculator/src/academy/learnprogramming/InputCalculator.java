package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double counter = 0;

        while (true) {
            boolean hasAnInt = scanner.hasNextInt();

            if (!hasAnInt) {
                break;
            }

            int number = scanner.nextInt();
            sum += number;
            counter += 1;

            scanner.nextLine(); // to handle the <Enter> key
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(sum / counter));

        scanner.close();
    }
}
