package ru.job4j.loop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumber3Test {

    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber3.calc(finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber3.calc(finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber3.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}