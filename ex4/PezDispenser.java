class PezDispenser {
	private String characterName;


	// Added a constructor that allows
	//us to set character name
	//at instantiation
	public PezDispenser(String name) {
		characterName = name;
	}


	public String getCharacterName() {
		return characterName;
	}
}