package ru.job4j.loop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumber2Test {

    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber2.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber2.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber2.check(number);
        Assert.assertFalse(result);
    }
}