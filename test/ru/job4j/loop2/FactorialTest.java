package ru.job4j.loop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(rsl, expected);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(rsl, expected);
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}