package academy.learnprogramming;
import java.util.*;

public class Solution {
    private static final int limit = 1000000;
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int k = scanner.nextInt();

            System.out.println(getPositiveDivisors(k));
        }

        scanner.close();
    }

    private static int getPositiveDivisors(int k) {
        int counter = 0;
        int prevDivisor = 2;
        for (int i = 3; i <= k; i++) {
            int currentDivisors;

            if (memo.containsKey(i)) {
                currentDivisors = memo.get(i);
            } else {
                currentDivisors = numberOfDivisors(i);
                memo.put(i, currentDivisors);
            }

            if (prevDivisor == currentDivisors) {
                counter++;
            }

            prevDivisor = currentDivisors;
        }

        return counter;
    }

    private static int numberOfDivisors(int x) {
//        return 1;
        int numOfDivisors = 2;
        for (int k = 2; k <= Math.sqrt(x); k++) {
            if (x % k == 0) {
                if (k != Math.sqrt(x)) {
                    numOfDivisors += 2;
                } else {
                    numOfDivisors += 1;
                }
            }
        }
        return numOfDivisors;
    }
}