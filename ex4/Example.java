public class Example {

	public static void main(String[] args) {
		// Your amazing code goes here...
		System.out.println("We are making a new PEZ Dispenzer");
		PezDispenser dispenser = new PezDispenser("Manu Ginobili"); //Here character name is set at instantiation
		System.out.printf("The dispenser is %s %n",
						   dispenser.getCharacterName()
						 );
	}
}