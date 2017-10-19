package test.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionOrderTest {

    @Test
    public void testB() {
        assertThat(1 + 1, is(2));
    }

    @Test
    public void test1() {
        assertThat(1 + 1, is(2));
    }

    @Test
    public void testA() {
        assertThat(1 + 1, is(2));
    }

    @Test
    public void test2() {
        assertThat(1 + 1, is(2));
    }

    @Test
    public void testC() {
        assertThat(1 + 1, is(2));
    }

}