package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int number = 4;
	    int finishNumber = 20;
	    int count = 0;
	    int total = 0;

	    while (number < finishNumber) {
	        if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
                total += number;
                count += 1;
            }

	        if (count == 5) {
	            break;
            }

	        number++;
        }

        System.out.println(total);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
