package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int value1, int value2) {
        if (value1 < 10 || value2 < 10) {
            return -1;
        }

        int greatestDivisor = value1;
        int count = 2;
        int greatestCommonDivisor = 1;

        if (value1 > value2) {
            greatestDivisor = value2;
        }

        while (count <= greatestDivisor) {
            if (value1 % count == 0 && value2 % count == 0) {
                greatestCommonDivisor = count;
            }

            count++;
        }

        return  greatestCommonDivisor;
    }
}
