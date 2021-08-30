package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Max2Test {

    @Test
    public void when1max() {
        int first = 156;
        int second = 5;
        int rsl = Max2.max(first, second);
        int expected = 156;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when2max() {
        int first = 156;
        int second = 65656495;
        int rsl = Max2.max(first, second);
        int expected = 65656495;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when2equal() {
        int first = 156;
        int second = 156;
        int rsl = Max2.max(first, second);
        int expected = 156;
        Assert.assertEquals(rsl, expected);

    }

    @Test
    public void when2biggerFrom3() {
        int first = 156;
        int second = 65656495;
        int third = 5465;
        int rsl = Max2.max3(first, second, third);
        int expected = 65656495;
        Assert.assertEquals(rsl, expected);

    }

    @Test
    public void when4biggerFrom4() {
        int first = 156;
        int second = 6565;
        int third = 5465;
        int forth = 213132131;
        int rsl = Max2.max4(first, second, third, forth);
        int expected = 213132131;
        Assert.assertEquals(rsl, expected);

    }

}