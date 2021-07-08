package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 7;
        double ac = 7;
        double bc = 7;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(rsl);

    }

    @Test
    public void whenNotExist() {
        double ab = 7;
        double ac = 7;
        double bc = 49;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(!rsl);

    }
}