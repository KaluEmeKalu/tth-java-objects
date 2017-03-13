public class Example {

	public static void main(String[] args) {
		// Your amazing code goes here...
		System.out.println("We are making a new PEZ Dispenzer");
		PezDispenser dispenser = new PezDispenser("Manu Ginobili");
		System.out.printf("The dispenser is %s %n",
						   dispenser.getCharacterName()
						 );

		//Here Chris calls the method he made
		//that switches heads.
		//Silly Chris.
		String before = dispenser.swapHead("Lebron James");
		System.out.printf("It was %s but Chris switch it to %s %n",
			              before,
			              dispenser.getCharacterName());
	}
}