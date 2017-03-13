public class Example {

	public static void main(String[] args) {
		// Your amazing code goes here...
		System.out.println("We are making a new PEZ Dispenzer");
		System.out.printf("Fun FACT: There are %d PEZ allowed in every dispenser %n", 
			              PezDispenser.MAX_PEZ);
		PezDispenser dispenser = new PezDispenser("Manu Ginobili");
		System.out.printf("The dispenser is %s %n",
						   dispenser.getCharacterName()
						 );

		//if empty then fill it up
		if (dispenser.isEmpty()) {
			System.out.println("Dispenser is empty");
		}


		System.out.println("Filling the dispenser with delicious PEZ...");
		dispenser.fill();

		//if full say it's full
		// use ! for see if NOT empty
		if (!dispenser.isEmpty()) {
			System.out.println("Dispenser is Full");
		}
	}
}