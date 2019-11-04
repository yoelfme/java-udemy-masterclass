package academy.learnprogramming;

public class FlourPacker {
    private final static int BIG_COUNT = 5;
    private final static int SMALL_COUNT = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int total = (bigCount * BIG_COUNT) + (smallCount * SMALL_COUNT);

        if (total < goal) {
            return false;
        }

        if (bigCount * BIG_COUNT > goal) {
            return (goal % BIG_COUNT) <= smallCount;
        } else if  (bigCount * BIG_COUNT < goal) {
            return (goal - (bigCount * BIG_COUNT)) <= smallCount;
        }

        return ((bigCount * BIG_COUNT == goal) || (smallCount * SMALL_COUNT == goal));
    }
}
