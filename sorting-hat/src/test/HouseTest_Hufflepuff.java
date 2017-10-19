package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import model.Houses;
import model.Student;
import model.StudentImpl;
import model.Trait;

@RunWith(value = Parameterized.class)
public class HouseTest_Hufflepuff {

	@Parameter
    public Student student;
	
	@Parameter(value = 1)
	public double result;
	
	@Test
	public void calculaSemelhancaEntreAlunoEGrifinoria() {
		assertThat(Houses.getHufflepuff().traitSuits(student), is(result));
	}
	
	@Parameters(name = "{index}: retornaValorQuandoEstudanteTemPeloMenosUmTracoDaCasa({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{new StudentImpl("Lucas", Arrays.asList()), 0},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.HUMBLE)), 0.1},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.HUMBLE, Trait.BENEVOLENCE)), 0.2},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.HUMBLE, Trait.BENEVOLENCE, Trait.FRIENDLY)), 0.30000000000000004},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.HUMBLE, Trait.BENEVOLENCE, Trait.FRIENDLY, Trait.HARDWORKING)), 0.4},
        	
        	{new StudentImpl("Lucas", Arrays.asList(Trait.LACK_OF_DRIVE)), 0.19999999999999998},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.LACK_OF_DRIVE, Trait.NOT_SPECIAL)), 0.39999999999999997},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.LACK_OF_DRIVE, Trait.NOT_SPECIAL, Trait.TO_HUMBLE)), 0.6},
        });
    }
}
