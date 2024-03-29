package academy.learnprogramming;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = number % 10; // initialize sum with the last digit

        while (number >= 10) {
            number /= 10;
        }

        return sum + number;
    }
}
