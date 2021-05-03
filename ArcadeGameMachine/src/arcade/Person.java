package arcade;

public class Person {
	int coins, minus;
	
	public Person(int coins) {
		this.coins = coins;
		this.minus = 2;
	}

	public void insertCoin( Coinable coinable, int coins) {
		System.out.println("Welcome to Arcade! \n-2 coins per game-");
		System.out.println("\nInsert coin here...");
		System.out.println("Coins Inserted= " + coins);
		
		
		if (coins > 1) {
		if(!coinable.insertCoin()) {
		}
		else {
			coins = coins - minus;
			System.out.println("You have " + coins + " coins left");
			System.out.println("Play another game?\n");
		}
		}
		else {
		System.out.println("Coins Returned\n");
		}
	}
}
