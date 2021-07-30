package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Min2Test {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 18, 1};
        int result = Min2.findMin(array);
        int expected = 0;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min2.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min2.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}