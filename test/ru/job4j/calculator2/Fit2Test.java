package ru.job4j.calculator2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Fit2Test {

    @Test
    public void whenManHeight187Weight105() {
        short height = 187;
        double expected = 100.05;
        double out = Fit2.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWomanHeight164Weight62() {
        short height = 164;
        double expected = 62.09;
        double out = Fit2.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}