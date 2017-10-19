package model;

import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHatImpl implements SortingHat {

	@Override
	public void reciteIntroductorySong() {
		Calendar now = Calendar.getInstance();
		
		Song song = SongFactory.get(now.get(Calendar.YEAR));
		
		song.getVerses().forEach(System.out::println);
	}

	@Override
	public House sort(Student student) {
		Map<House, Double> map = new HashMap<>();
		
		map.put(Houses.getGryffindor(), Houses.getGryffindor().traitSuits(student));
		map.put(Houses.getHufflepuff(), Houses.getHufflepuff().traitSuits(student));
		map.put(Houses.getRavenclaw(), Houses.getRavenclaw().traitSuits(student));
		map.put(Houses.getSlytherin(), Houses.getSlytherin().traitSuits(student));
		
		Entry<House, Double> result = map.entrySet()
				.stream()
				.max(Comparator.comparing(Entry::getValue))
				.get();
		
		return result.getKey();
	}

}
