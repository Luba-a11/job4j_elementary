package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.junit.Assert.*;

public class Max2Test {

    @Test
    public void when1max() {
        int left = 156;
        int right = 5;
        int rsl = Max2.max(left, right);
        int expected = 156;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when2max() {
        int left = 1;
        int right = 65465;
        int rsl = Max2.max(left, right);
        int expected = 65465;
        Assert.assertEquals(rsl, expected);
    }
}