package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreet() {
        String in = "Привет, Бот";
        String rsl = DummyBot.answer(in);
        String exp = "Привет, умник";
        Assert.assertEquals(rsl, exp);

    }

    @Test
    public void whenBye() {
        String in = "Пока";
        String rsl = DummyBot.answer(in);
        String exp = "Пока, умник";
        Assert.assertEquals(rsl, exp);

    }

    @Test
    public void whenUnknow() {
        String in = "2*2";
        String rsl = DummyBot.answer(in);
        String exp = "Это ставит меня в тупик, умник. Задай другой вопрос, умник";
        Assert.assertEquals(rsl, exp);

    }
}