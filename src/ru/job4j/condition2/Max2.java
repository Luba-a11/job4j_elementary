package ru.job4j.condition2;

public class Max2 {
  public static String max(int left, int right) {

        String rsl = left > right ? "Левое число больше правого" : "Правое число больше левого";
        return rsl;
    }

    public static void main(String[] args) {
        String msg = Max2.max(5,22);
        System.out.println(msg);
    }
}
