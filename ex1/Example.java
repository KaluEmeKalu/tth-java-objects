public class Example {

	public static void main(String[] args) {
		// Your amazing code goes here...
		System.out.println("We are making a new PEZ Dispenzer");
		PezDispenser dispenser = new PezDispenser();
		dispenser.characterName = "Manu Ginobili"; //We should allow users to change this in the future
		System.out.printf("The dispenser is %s %n",
						   dispenser.characterName);
	}
}