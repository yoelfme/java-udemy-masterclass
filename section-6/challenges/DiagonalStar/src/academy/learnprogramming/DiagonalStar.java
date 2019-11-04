package academy.learnprogramming;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
            return;
        }

        int length = (number - 1);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == length || i == j || j == 0 || j == length || (length - i) == j) {
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
