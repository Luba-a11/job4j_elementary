package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqArea2Test {

    @Test
    public void whenP6K2square2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea2.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP8K10square1() {
        int p = 8;
        double k = 10;
        double expected = 1.32;
        double out = SqArea2.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP112K5square435() {
        int p = 112;
        double k = 5;
        double expected = 435.55;
        double out = SqArea2.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}