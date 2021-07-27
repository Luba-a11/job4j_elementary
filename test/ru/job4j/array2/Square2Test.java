package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.Square;

import static org.junit.Assert.*;

public class Square2Test {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rslt = Square2.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expected, rslt);
    }

    @Test
    public void whenBound5Then() {
        int bound = 5;
        int[] rslt = Square2.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, rslt);
    }

}