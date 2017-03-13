class PezDispenser {
	private String characterName;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return characterName;
	}

	//Our character is never suppsoed to be 
	//switched. But oen of our developers Chris
	//doesn't know that and created the following
	//method to switch character heads
	public String swapHead(String characterName) {
		String originalCharacterName = this.characterName;
		this.characterName = characterName;
		return originalCharacterName;
	}
}