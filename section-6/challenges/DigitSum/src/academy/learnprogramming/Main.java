package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1299));
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int total = 0;
        while (number > 0) {
            // extract the least-significant digit
            total += (number % 10);

            // drop the least-significant digit
            number = number / 10;
        }

        return total;
    }
}
