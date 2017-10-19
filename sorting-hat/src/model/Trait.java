package model;

public enum Trait {
	BRAVERY,
	DARING("even when they don't have all the information, they will be the first to jump to action. They seek glory for the mere sake of getting glory, not money or academics or a position of power"),
	ATHLETIC,
	CHIVALROUS("they choose to do what's noble over what's lawfully right, outright breaking the law if they think it's for a good cause."),
	POPULARITY,
	RECKLESSNESS("they having too much nerve can lead them to take risk in situations where they are not in control."),
	SENSE_OF_SELFRIGHTEOUSNESS("they tend to think their way of doing things is the best way to do things because they take the \"noble\" road"),
	AN_EYE_FOR_AN_EYE("if they think a certain person deserves to be treated badly, they will do it."),
	CUNNING("they are very crafty and sneaky, rarely ever getting caught"),
	AMBITION,
	RESOURCEFUL("they may not have all the answers, but they know how to use what they have"),
	PURE_LINEAGE,
	SENSE_OF_SELFPRESERVATION("they don't look for heroes in this house"),
	ENDS_JUSTIFY_THE_MEANS("they tend to be more lax when it comes to morals"),
	POWER_HUNGRY("they like influential people"),
	HUMBLE("they are modest and meek"),
	BENEVOLENCE("They do the right thing because it's the right thing, not for glory or selfish reasons"),
	FRIENDLY("they don't have biases based on stereotypes like the other Houses"),
	HARDWORKING("they don't cheat or look for loop holes. Just good old fashioned work"),
	LACK_OF_DRIVE("they have a very low competitive nature. This hurts them when it comes to points."),
	NOT_SPECIAL("they take the slow route and don't always make the cut."),
	TO_HUMBLE("they brag or talk about their accomplishments"),
	INTELLIGENT,
	CREATIVITY,
	GOOD_LOOKS,
	SELF_SUFFICIENT("very resourceful and vast knowledge = very little outside help needed"),
	CLIQUES("they prefer to stay to themselves and study, rarely interacting with others during assignments"),
	ARROGANT("they look down on others on occasion since they are sexy nerds who make good grades");
	
	private String description;

	private Trait(String description) {
		this.setDescription(description);
	}
	
	private Trait() {
		this.setDescription("Nothing");
	}
	
	public String getDescription() {
		return this.description;
	}
	
	private void setDescription(String description) {
		this.description = description;
	}
}
