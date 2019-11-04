package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        for (double i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        for (double i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;

        for (int i = 15; i < 100; i++) {
            if (isPrime(i)) {
                count++;

                System.out.println("Number " + i + " is a primer number");

                if (count == 10) {
                    break;
                }
            }


        }

        System.out.println("Primers = " + count);
    }
    
    public static double calculateInterest(double amount, double interestRate) {
        return  (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
