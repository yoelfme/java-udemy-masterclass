package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = (minutes / 24 / 60) % 365;
        long years = (minutes / 24 / 60) / 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
