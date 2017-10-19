package model;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SongFactory {
	
	private final static Map<Integer, Song> songsDictionary = createMap();
	
	public static Song get(int year) {
		Song song = songsDictionary.get(year);
		
		if (song == null) throw new InvalidParameterException();
		
		return song;
	}
	
	private static Map<Integer, Song> createMap() {
		Map<Integer, Song> map = new HashMap<>();
        
		map.put(2017, new SongImpl(get2017SongVerses()));
		map.put(2019, new SongImpl(get2019SongVerses()));
        
        return map;
    }
	
	private static List<String> get2017SongVerses() {
		
		return Arrays.asList("I've done this job for centuries"
							,"On every student's head I've sat"
							,"Of thoughts I take inventories"
							,"For I'm the famous Sorting Hat."
							,""
							,"I've sorted high, I've sorted low,"
							,"I've done the job through thick and thin"
							,"So put me on and you will know"
							,"Which house you should be in...");
	}
	
	private static List<String> get2019SongVerses() {
		
		return Arrays.asList("Are you afraid of what you'll hear?"
							,"Afraid I'll speak the name you fear?"
							,"Not Slytherin! Not Gryffindor!"
							,"Not Hufflepuff! Not Ravenclaw!"
							,"Don't worry, child, I know my job,"
							,"You'll learn to laugh, if first you sob.");
	}
}
