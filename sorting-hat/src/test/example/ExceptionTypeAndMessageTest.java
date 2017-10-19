package test.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTypeAndMessageTest {

	@Test
    public void testDivisionWithException() {
        try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
        }
    }

    @Test
    public void testEmptyList() {
        try {
            new ArrayList<>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }

}
