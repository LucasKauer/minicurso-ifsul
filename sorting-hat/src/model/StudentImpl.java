package model;

import java.util.List;

public class StudentImpl implements Student {

	private String name;
	private List<Trait> traits;
	
	public StudentImpl(String name, List<Trait> traits) {
		this.setName(name);
		this.setTraits(traits);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public List<Trait> getTraits() {
		return traits;
	}

	private void setTraits(List<Trait> traits) {
		this.traits = traits;
	}
}
