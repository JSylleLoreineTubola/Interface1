package arcade;

public class TestMachine {
	
	public static void main (String[] args) {
		
		ArcadeMachine arcadeMachine = new ArcadeMachine();
		Person person = new Person(5);
		
		person.insertCoin(arcadeMachine, 5);
		person.insertCoin(arcadeMachine, 25);
		person.insertCoin(arcadeMachine, 3);
		person.insertCoin(arcadeMachine, 1);
		person.insertCoin(arcadeMachine, 100);
		
	

}
}
