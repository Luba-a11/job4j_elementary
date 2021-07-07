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
        String rsl = Max2.max(left, right);
        String expected = "Левое число больше правого";
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when2max() {
        int left = 1;
        int right = 65465;
        String rsl = Max2.max(left, right);
        String expected = "Правое число больше левого";
        Assert.assertEquals(rsl, expected);
    }
}