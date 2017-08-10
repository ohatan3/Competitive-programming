package test.other;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import main.other.ChangePattern;

public class ChangePatternTest {

    ChangePattern testee = new ChangePattern();

    @Test
    public void test01() {
        int result = testee.getPattern(5);

        assertThat(result, is(2));
    }

    @Test
    public void test02() {
        int result = testee.getPattern(7);

        assertThat(result, is(2));
    }

    @Test
    public void test03() {
        int result = testee.getPattern(12);

        assertThat(result, is(4));
    }

    @Test
    public void test04() {
        int result = testee.getPattern(15);

        assertThat(result, is(6));
    }

    @Test
    public void test05() {
        int result = testee.getPattern(10);

        assertThat(result, is(4));
    }
}
