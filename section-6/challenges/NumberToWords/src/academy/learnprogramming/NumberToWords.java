package academy.learnprogramming;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int digits = getDigitCount(number);

        for (int i = 0; i < digits; i++) {
            int digit = reversedNumber % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNumber /= 10;
        }
    }

    public static int reverse(int value) {
        int sign = 1;
        if (value < 0) {
            sign = -1;
        }

        value *= sign;

        int reverse = 0;

        while (value > 0) {
            int digit = value % 10;

            reverse = (reverse * 10) + digit;

            value /= 10;
        }

        return reverse * sign;
    }

    public static int getDigitCount(int value) {
        if (value == 0) {
            return 1;
        }

        if (value < 0) {
            return -1;
        }

        int digits = 0;
        while (value > 0) {
            digits ++;

            value /= 10;
        }

        return digits;
    }
}
