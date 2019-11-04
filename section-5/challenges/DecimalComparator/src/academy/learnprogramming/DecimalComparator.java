package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        int number1Scaled = (int) (number1 * 1000);
        int number2Scaled = (int) (number2 * 1000);

        return number1Scaled == number2Scaled;
    }
}
