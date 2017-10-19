package model;

import java.util.List;

public class SongImpl implements Song {

	private final List<String> verses;
	
	public SongImpl(List<String> verses) {
		this.verses = verses;
	}

	public List<String> getVerses() {
		return this.verses;
	}
}
