package test.example;

import org.junit.Test;

public class TimeoutTest {
	
	//This test will always failed :)
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }

    @Test(timeout = 5000)
    public void testSlowMethod() {
        //...
    }
}
