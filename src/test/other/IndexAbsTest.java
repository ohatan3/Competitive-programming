package test.other;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import main.other.IndexAbs;

public class IndexAbsTest {

    private IndexAbs testee = new IndexAbs();

    @Test
    public void testNomarl01() {

        int[] input = { 1, 2, 3, 4, 5, 6, 1 };
        int result = testee.getAbsIndex(input);
        assertThat(result, is(6));

    }

    @Test
    public void testNomarl02() {

        int[] input = { 1, 2, 3, 4, 4, 6, 7 };
        int result = testee.getAbsIndex(input);
        assertThat(result, is(1));

    }

    @Test
    public void testNomarl03() {

        int[] input = { 1, 2, 3, 4, 4, 3, 2 };
        int result = testee.getAbsIndex(input);
        assertThat(result, is(5));

    }

    @Test
    public void testNotExistSameValue() {

        int[] input = { 1, 2, 3, 4, 5, 6, 7 };
        int result = testee.getAbsIndex(input);
        assertThat(result, is(-1));

    }
}
