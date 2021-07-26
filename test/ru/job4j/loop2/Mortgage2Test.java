package ru.job4j.loop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Mortgage2Test {

    @Test
    public void when1year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage2.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void when2year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage2.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(result, expected);

    }
}