
public class GumballMachine implements Coinable, Dispensable {
	int gums;
	
	public GumballMachine() {
		this.gums = 5;
	}

	@Override
	public void dispense() {
		this.gums--;
		System.out.println("Gum dispensed: 1");
	}

	@Override
	public void reload(int count) {
		this.gums += count;
	}

	@Override
	public boolean insertCoin() {
		if (this.gums > 0) {
			this.dispense();
			return true;
		}
		
		return false;
	}

}
