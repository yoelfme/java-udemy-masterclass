package academy.learnprogramming;

public class TeenNumberChecker {
    public static boolean hasTeen(int value1, int value2, int value3) {
        return isTeen(value1) || isTeen(value2) || isTeen(value3);
    }

    public static boolean isTeen(int value) {
        return (value >= 13 && value <= 19);
    }
}
