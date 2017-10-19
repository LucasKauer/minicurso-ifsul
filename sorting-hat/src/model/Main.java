package model;


import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Student tobias = new StudentImpl("Tobia", getGryffindorTraits()),
				henry = new StudentImpl("Henry", getHufflepuffTraits()),
				james = new StudentImpl("James", getRavenclawTraits()),
				ammy = new StudentImpl("Ammy", getSlytherinTraits()),
				all = new StudentImpl("All", all());
		
		List<Student> firstYearStudents = Arrays.asList(tobias, henry, james, ammy, all);
		
		SortingCeremony.start(firstYearStudents);
	}
	
	private static List<Trait> all() {
		return Arrays.asList(Trait.BRAVERY
				,Trait.HUMBLE);
	}
	
	private static List<Trait> getGryffindorTraits() {
		return Arrays.asList(Trait.BRAVERY
				,Trait.DARING
				,Trait.ATHLETIC
				,Trait.CHIVALROUS
				,Trait.POPULARITY
				,Trait.ARROGANT
				,Trait.RECKLESSNESS
				,Trait.SENSE_OF_SELFRIGHTEOUSNESS
				,Trait.AN_EYE_FOR_AN_EYE);
	}
	
	private static List<Trait> getHufflepuffTraits() {
		return Arrays.asList(Trait.HUMBLE
				,Trait.BENEVOLENCE
				,Trait.FRIENDLY
				,Trait.HARDWORKING
				,Trait.LACK_OF_DRIVE
				,Trait.NOT_SPECIAL
				,Trait.TO_HUMBLE);
	}
	
	private static List<Trait> getRavenclawTraits() {
		return Arrays.asList(Trait.INTELLIGENT
				,Trait.CREATIVITY
				,Trait.GOOD_LOOKS
				,Trait.SELF_SUFFICIENT
				,Trait.CLIQUES
				,Trait.ARROGANT);
	}
	
	private static List<Trait> getSlytherinTraits() {
		return Arrays.asList(Trait.CUNNING
				,Trait.AMBITION
				,Trait.RESOURCEFUL
				,Trait.PURE_LINEAGE
				,Trait.SENSE_OF_SELFPRESERVATION
				,Trait.ENDS_JUSTIFY_THE_MEANS
				,Trait.POWER_HUNGRY);
	}
}
