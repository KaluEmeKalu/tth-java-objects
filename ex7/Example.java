public class Example {

	public static void main(String[] args) {
		// Your amazing code goes here...
		System.out.println("We are making a new PEZ Dispenzer");
		//because Max_PEZ is a class variable
		//we can access it before we instantiate a PezDispenser object
		System.out.printf("Fun FACT: There are %d PEZ allowed in every dispenser", 
			              PezDispenser.MAX_PEZ);
		PezDispenser dispenser = new PezDispenser("Manu Ginobili");
		System.out.printf("The dispenser is %s %n",
						   dispenser.getCharacterName()
						 );
	}
}