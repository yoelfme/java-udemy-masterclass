package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
	    dog.breath();
	    dog.eat();

	    Parrot bird = new Parrot("Australian ringneck");
	    bird.breath();
	    bird.eat();
	    bird.fly();

	    Penguin penguin = new Penguin("Emperor");
	    penguin.fly();
    }
}
