package arcade;

public class ArcadeMachine implements Coinable, Dispensable {
	int insert;
	
	public ArcadeMachine() {
		this.insert = 5;
	}

	@Override
	public void dispense() {
		this.insert--;
		System.out.println("Game Started!");
		System.out.println("End of the Game!");
		
	}

	@Override
	public void reload(int count) {
		this.insert += count;
	}

	@Override
	public boolean insertCoin() {
		if (this.insert > 0) {
			this.dispense();
			return true;
		}
		
		return false;
	}

}
