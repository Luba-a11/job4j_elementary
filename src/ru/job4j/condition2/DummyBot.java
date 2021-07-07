package ru.job4j.condition2;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик, умник. Задай другой вопрос, умник";
        if (question.equals("Привет, Бот")) {
           rsl = "Привет, умник";

        } else if (question.equals("Пока")) {
            rsl = "Пока, умник";
        }
         return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("2*2");
        System.out.println(rsl);

        rsl = DummyBot.answer("Пока");
        System.out.println(rsl);
    }
}
