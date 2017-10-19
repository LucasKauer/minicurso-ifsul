package model;

import java.util.List;

public class HouseStudentsTraitsImpl implements HouseStudentsTraits {

	private List<Trait> positives;
	private List<Trait> negatives;
	
	public HouseStudentsTraitsImpl(List<Trait> positives, List<Trait> negatives) {
		this.setPositives(positives);
		this.setNegatives(negatives);
	}

	public List<Trait> getPositives() {
		return positives;
	}

	private void setPositives(List<Trait> positives) {
		this.positives = positives;
	}

	public List<Trait> getNegatives() {
		return negatives;
	}

	private void setNegatives(List<Trait> negatives) {
		this.negatives = negatives;
	}
}
