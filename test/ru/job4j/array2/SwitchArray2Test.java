package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArray2Test {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray2.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 89, 12, 95};
        int source = 1;
        int dest = 5;
        int[] result = SwitchArray2.swap(input, source, dest);
        int[] expected = {1, 12, 3, 4, 89, 2, 95};
        Assert.assertArrayEquals(expected, result);
    }

}