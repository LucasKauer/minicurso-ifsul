package test.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        ExceptionTypeTest.class,
        TimeoutTest.class
})
public class SuiteAbcTest {
}
