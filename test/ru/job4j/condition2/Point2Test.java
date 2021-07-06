package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point2Test {

    @Test
    public void whenX5X2Y7Y9ThenDistance17() {
        double expected = 17.46;
        double out = Point2.distance(5, -2, 7, -9);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenX15X22Y37Y9ThenDistance67() {
        int expected = 67;
        int out = (int) Point2.distance(15, -22, 37, -19);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenX0X2Y0Y0ThenDistance2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point2.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}