class PezDispenser {
	//Added MAX_PEZ
	//make sure to make it final
	//because in reality users can't
	//change the max amount of pezs
	//that can go into a pez dispenser

	//also make sure it's static so it belongs
	//as a class member and not an instance member
	//it's a class level variable.
	//with the static keyword it 
	//also you to provide variables directly on your class
	//also opposed on the instance.
	public static final int MAX_PEZ = 12;
	final private String characterName;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return characterName;
	}

}