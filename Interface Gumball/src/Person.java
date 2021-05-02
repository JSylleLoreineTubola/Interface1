public class Person {
	int coins, minus;
	
	public Person(int coins) {
		this.coins = coins;
		this.minus = 3;
	}

	public void insertCoin( Coinable coinable, int coins) {
		System.out.println("\nCoins Inserted= " + coins);
		
		
		if (coins > 2) {
		if(!coinable.insertCoin()) {
		}
		else {
			coins = coins - minus;
			System.out.println("Change= " + coins);
		}
		}
		else {
		System.out.println("Coins Returned");
		}
	}
}
