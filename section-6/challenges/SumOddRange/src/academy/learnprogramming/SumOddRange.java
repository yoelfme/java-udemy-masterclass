package academy.learnprogramming;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }

        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || start > end) {
            return -1;
        }

        int total = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }

        return total;
    }
}
