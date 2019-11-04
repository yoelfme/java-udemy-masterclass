package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int value1, int value2, int value3) {
         if (!isValid(value1) || !isValid(value2) || !isValid(value3)) {
             return false;
         }

         int lastDigit1 = value1 % 10;
         int lastDigit2 = value2 % 10;
         int lastDigit3 = value3 % 10;

         return (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3);
    }

    public static boolean isValid(int value) {
        return value >= 10 && value <= 1000;
    }
}
