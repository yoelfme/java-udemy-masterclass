package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "Tim";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHealth(damage);

        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer newPlayer = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health is " + newPlayer.getHealth());
    }
}
