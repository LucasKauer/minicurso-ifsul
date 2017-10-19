package test.example;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import test.example.CustomException;

public class ElegantExceptionTypeAndMessageTest {
	
	@Rule
    public ExpectedException thrown = 
    ExpectedException.none();

    @Test
    public void testDivisionWithException() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("/ by zero"));

        int i = 1 / 0;
    }

    @Test
    public void testNameNotFoundException() throws CustomException {
        thrown.expect(CustomException.class);

        thrown.expectMessage(is("Name is empty!"));

        throw new CustomException("Name is empty!");
    }
}
