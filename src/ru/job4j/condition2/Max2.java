package ru.job4j.condition2;

public class Max2 {
  public static int max(int left, int right) {

       return left > right ? left : right;

    }

    public static void main(String[] args) {
        int msg = Max2.max(5,22);
        System.out.println(msg);
    }
}
