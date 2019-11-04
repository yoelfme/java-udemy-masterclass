package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double value1 = 20;
	    double value2 = 80;

	    double result = (value1 + value2) * 100;
	    double remainder = result % 40;

	    boolean gotRemainder = remainder != 0;

		System.out.println("Total = " + result);
		System.out.println("Remainder = " + remainder);

	    if (gotRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
