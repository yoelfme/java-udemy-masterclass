package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "250", dimensions);
	    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6);

	    PC myPC = new PC(theCase, monitor, motherboard);

	    myPC.powerUp();
    }
}
