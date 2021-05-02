
public class TestMachine {
	public static void main (String[] args) {
		
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person(5);
		
		person.insertCoin(gumballMachine, 5);
		person.insertCoin(gumballMachine, 50);
		person.insertCoin(gumballMachine, 3);
		person.insertCoin(gumballMachine, 1);
		person.insertCoin(gumballMachine, 20);
		
	

}
}
