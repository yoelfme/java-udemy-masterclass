package academy.learnprogramming;

public class SharedDigit {
    public static boolean hasSharedDigit(int value1, int value2) {
        if (value1 < 10 || value1 > 99 || value2 < 10 || value2 > 99) {
            return false;
        }

        int lastDigit1 = value1 % 10;
        int firstDigit1 = value1 / 10;

        int lastDigit2 = value2 % 10;
        int firstDigit2 = value2 / 10;

        return (firstDigit1 == firstDigit2 ||
                firstDigit1 == lastDigit2 ||
                lastDigit1 == firstDigit2 ||
                lastDigit1 == lastDigit2);
    }
}
