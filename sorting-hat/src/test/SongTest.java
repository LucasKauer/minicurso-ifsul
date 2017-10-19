package test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import model.SongFactory;

public class SongTest {

	@Test
	public void retornaCancaoQuandoAnoEhValido() {
		assertEquals(get2017Verses(), SongFactory.get(2017).getVerses());
		assertEquals(get2019Verses(), SongFactory.get(2019).getVerses());
	}
	
	@Test(expected = InvalidParameterException.class)
	public void lancaExcecaoQuandoAnoAindaNaoTemMusica() {
		SongFactory.get(2020);
	}

	private static List<String> get2017Verses(){
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
	
	private static List<String> get2019Verses() {
		
		return Arrays.asList("Are you afraid of what you'll hear?"
							,"Afraid I'll speak the name you fear?"
							,"Not Slytherin! Not Gryffindor!"
							,"Not Hufflepuff! Not Ravenclaw!"
							,"Don't worry, child, I know my job,"
							,"You'll learn to laugh, if first you sob.");
	}
}
