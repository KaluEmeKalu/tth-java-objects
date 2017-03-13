class PezDispenser {
	//Here we add the keyword final
	//this keeps the string from being changed
	//after it's instantiated
	//stopping Chris dead in his tracks
	//with his swapHead method that tries
	//to change the characterName
	final private String characterName;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return characterName;
	}

	//this code won't work anymore since we added
	//the final keyword
	public String swapHead(String characterName) {
		String originalCharacterName = this.characterName;
		this.characterName = characterName;
		return originalCharacterName;
	}
}