package ru.job4j.condition2;

public class Max2 {

     //создаем 1-ый метод для нахождения мах из 2-х
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    //создаем 2-ый метод для нахождения мах из 3-х
    public static int max(int first, int second, int third) {
       return max(first, max(second, third));
    }

    //создаем 3-ый метод для нахождения мах из 4-х
    public static int max(int first, int second, int third, int fourth) {
       return max(max(first, second), max(third, fourth));

    }

    public static void main(String[] args) {
        int msg1 = Max2.max(5, 22);
        System.out.println(msg1);
        int msg3 = Max2.max(97, 51, 222);
        System.out.println(msg3);
        int msg4 = Max2.max(5, 22, 343, 35);
        System.out.println(msg4);
    }

}
