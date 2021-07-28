package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoop2Test {

    @Test
    public void when5then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int rsl = FindLoop2.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when3then2() {
        int[] data = {5, 4, 3, 2};
        int el = 3;
        int rsl = FindLoop2.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when9then1() {
        int[] data = {5, 4, 3, 2};
        int el = 9;
        int rsl = FindLoop2.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(rsl, expected);
    }
}