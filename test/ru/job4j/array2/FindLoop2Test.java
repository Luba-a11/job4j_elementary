package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoop2Test {

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop2.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3};
        int el = 5;
        int rsl = FindLoop2.indexOf1(data, el);
        int expect = 0;
        assertThat(rsl, is(expect));

    }

    @Test
    public void whenArrayHas9Then1() {
        int[] data = {5, 4, 3};
        int el = 9;
        int rsl = FindLoop2.indexOf1(data, el);
        int expect = -1;
        assertThat(rsl, is(expect));
    }

}