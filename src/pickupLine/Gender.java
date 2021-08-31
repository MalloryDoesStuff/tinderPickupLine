package pickupLine;

public enum Gender {
	MAN("he", "him", "his", "his", "himself"),
	WOMAN("she", "her", "her", "hers", "herself"),
	ENBY("they", "them", "their", "theirs", "theirselves");
	private String subject;
	private String object;
	private String possesssiveAdjective;
	private String possesssivePronoun;
	private String reflexivePronoun;
	Gender(String subject, String object, String possesssiveAdjective, String possesssivePronoun, String reflexivePronoun) {
		this.subject = subject;
		this.object = object;
		this.possesssiveAdjective = possesssiveAdjective;
		this.possesssivePronoun = possesssivePronoun;
		this.reflexivePronoun = reflexivePronoun;
	}
	public String getSubject() {
		return subject;
	}
	public String getObject() {
		return object;
	}
	public String getPossesssiveAdjective() {
		return possesssiveAdjective;
	}
	public String getPossesssivePronoun() {
		return possesssivePronoun;
	}
	public String getReflexivePronoun() {
		return reflexivePronoun;
	}
}
