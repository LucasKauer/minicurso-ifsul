package model;

import java.util.Arrays;
import java.util.List;

public final class Houses {

	private static House gryffindor;
	private static House hufflepuff;
	private static House ravenclaw;
	private static House slytherin;
	
	public static House getGryffindor() {
		if (gryffindor == null) {
			gryffindor = new HouseImpl(HouseName.GRYFFINDOR, getGryffindorStudentsTraits());
        }
        return gryffindor;
	}
	
	public static House getHufflepuff() {
		if (hufflepuff == null) {
			hufflepuff = new HouseImpl(HouseName.HUFFLEPUFF, getHufflepuffStudentsTraits());
        }
        return hufflepuff;
	}
	
	public static House getRavenclaw() {
		if (ravenclaw == null) {
			ravenclaw = new HouseImpl(HouseName.RAVENCLAW, getRavenclawStudentsTraits());
        }
        return ravenclaw;
	}

	public static House getSlytherin() {
		if (slytherin == null) {
			slytherin = new HouseImpl(HouseName.SLYTHERIN, getSlytherinStudentsTraits());
        }
        return slytherin;
	}
	
	private static HouseStudentsTraits getGryffindorStudentsTraits() {
		List<Trait> positives = Arrays.asList(Trait.BRAVERY
				,Trait.DARING
				,Trait.ATHLETIC
				,Trait.CHIVALROUS
				,Trait.POPULARITY);
		
		List<Trait> negatives = Arrays.asList(Trait.ARROGANT
				,Trait.RECKLESSNESS
				,Trait.SENSE_OF_SELFRIGHTEOUSNESS
				,Trait.AN_EYE_FOR_AN_EYE);
		
		return new HouseStudentsTraitsImpl(positives, negatives);
	}
	
	private static HouseStudentsTraits getHufflepuffStudentsTraits() {
		List<Trait> positives = Arrays.asList(Trait.HUMBLE
				,Trait.BENEVOLENCE
				,Trait.FRIENDLY
				,Trait.HARDWORKING);
		
		List<Trait> negatives = Arrays.asList(Trait.LACK_OF_DRIVE
				,Trait.NOT_SPECIAL
				,Trait.TO_HUMBLE);
		
		return new HouseStudentsTraitsImpl(positives, negatives);
	}
	
	private static HouseStudentsTraits getRavenclawStudentsTraits() {
		List<Trait> positives = Arrays.asList(Trait.INTELLIGENT
				,Trait.CREATIVITY
				,Trait.GOOD_LOOKS
				,Trait.SELF_SUFFICIENT);
		
		List<Trait> negatives = Arrays.asList(Trait.CLIQUES
				,Trait.ARROGANT);
		
		return new HouseStudentsTraitsImpl(positives, negatives);
	}
	
	private static HouseStudentsTraits getSlytherinStudentsTraits() {
		List<Trait> positives = Arrays.asList(Trait.CUNNING
				,Trait.AMBITION
				,Trait.RESOURCEFUL
				,Trait.PURE_LINEAGE);
		
		List<Trait> negatives = Arrays.asList(Trait.SENSE_OF_SELFPRESERVATION
				,Trait.ENDS_JUSTIFY_THE_MEANS
				,Trait.POWER_HUNGRY);
		
		return new HouseStudentsTraitsImpl(positives, negatives);
	}
}
