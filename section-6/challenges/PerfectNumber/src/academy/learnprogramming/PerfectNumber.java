package academy.learnprogramming;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int count = 1;
        int sum = 0;

        while (count <= (number / 2)) {
            if (number % count == 0) {
                sum += count;
            }

            count++;
        }

        return (number == sum);
    }
}
