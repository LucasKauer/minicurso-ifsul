package model;

import java.util.List;
import java.util.function.Predicate;

public class HouseImpl implements House {

	private HouseName name;
	private HouseStudentsTraits houseStudentsTraits;
	
	public HouseImpl(HouseName name, HouseStudentsTraits studentsTraits) {
		this.setName(name);
		this.setHouseStudentsTraits(studentsTraits);
	}
	
	public double traitSuits(Student student) {
		double positive = countPositiveTraits(student) * 0.4;
		double negative = countNegativeTraits(student) * 0.6;
		
		if (positive != 0) {
			long totalPositives = this.count(this.getHouseStudentsTraits().getPositives());
			positive /= totalPositives;
		}
			
		if (negative != 0) {
			long totalNegatives = this.count(this.getHouseStudentsTraits().getNegatives());
			negative /= totalNegatives;
		}
		
		return positive + negative;
	}
	
	public HouseName getName() {
		return this.name;
	}

	private void setName(HouseName name) {
		this.name = name;
	}

	public HouseStudentsTraits getHouseStudentsTraits() {
		return this.houseStudentsTraits;
	}

	private void setHouseStudentsTraits(HouseStudentsTraits houseStudentsTraits) {
		this.houseStudentsTraits = houseStudentsTraits;
	}
	
	private long countPositiveTraits(Student student) {
		return this.countTraits(student, (Predicate<Trait>) this::filterPositiveTraits);
	}

	private long countNegativeTraits(Student student) {
		return this.countTraits(student, (Predicate<Trait>) this::filterNegativeTraits);
	}
	
	private long countTraits(Student student, Predicate<Trait> predicate) {
		return student.getTraits()
				.stream()
				.filter(predicate)
				.count();
	}
	
	private boolean filterPositiveTraits(Trait trait) {
		return this.filterTraits(getHouseStudentsTraits().getPositives(), trait);
	}
	
	private boolean filterNegativeTraits(Trait trait) {
		return this.filterTraits(getHouseStudentsTraits().getNegatives(), trait);
	}
	
	private boolean filterTraits(List<Trait> traits, Trait trait) {
		return traits.contains(trait);
	}
	
	private long count(List<Trait> traits) {
		return traits.stream().count();
	}
}
