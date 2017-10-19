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
public class HouseTest_Gryffindor {

	@Parameter
    public Student student;
	
	@Parameter(value = 1)
	public double result;
	
	@Test
	public void calculaSemelhancaEntreAlunoEGrifinoria() {
		assertThat(Houses.getGryffindor().traitSuits(student), is(result));
	}
	
	@Parameters(name = "{index}: retornaValorQuandoEstudanteTemPeloMenosUmTracoDaCasa({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{new StudentImpl("Lucas", Arrays.asList()), 0},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.BRAVERY)), 0.08},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.BRAVERY, Trait.DARING)), 0.16},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.BRAVERY, Trait.DARING, Trait.ATHLETIC)), 0.24000000000000005},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.BRAVERY, Trait.DARING, Trait.ATHLETIC, Trait.CHIVALROUS)), 0.32},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.BRAVERY, Trait.DARING, Trait.ATHLETIC, Trait.CHIVALROUS, Trait.POPULARITY)), 0.4},
        	
        	{new StudentImpl("Lucas", Arrays.asList(Trait.ARROGANT)), 0.15},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.ARROGANT, Trait.RECKLESSNESS)), 0.3},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.ARROGANT, Trait.RECKLESSNESS, Trait.SENSE_OF_SELFRIGHTEOUSNESS)), 0.44999999999999996},
        	{new StudentImpl("Lucas", Arrays.asList(Trait.ARROGANT, Trait.RECKLESSNESS, Trait.SENSE_OF_SELFRIGHTEOUSNESS, Trait.AN_EYE_FOR_AN_EYE)), 0.6}
        });
    }
}
