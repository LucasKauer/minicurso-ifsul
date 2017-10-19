package model;

import java.util.Comparator;
import java.util.List;

public final class SortingCeremony {

	private static final SortingHat theSortingHat = new SortingHatImpl();
	
	public static void start(List<Student> firstYearStudents) {
		firstYearStudents.sort(Comparator.comparing(Student::getName));
		
		theSortingHat.reciteIntroductorySong();
		
		firstYearStudents.forEach(SortingCeremony::announceTheHouse);
	}
	
	public static void announceTheHouse(Student student) {
		House result = theSortingHat.sort(student);
		System.out.println(result.getName());
	}
}
