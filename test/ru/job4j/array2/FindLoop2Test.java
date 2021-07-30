package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

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
}