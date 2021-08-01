package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSum2Test {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum2.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {8, 2},
                {11, 2}
        };
        int result = MatrixSum2.sum(array);
        int expected = 23;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum2.sum(array);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}