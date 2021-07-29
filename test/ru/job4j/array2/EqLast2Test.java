package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLast2Test {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 6, 7, 4};
        boolean result = EqLast2.check(left, right);
        Assert.assertTrue(result);

    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 6, 7, 89};
        boolean result = EqLast2.check(left, right);
        Assert.assertTrue(result);
    }

}