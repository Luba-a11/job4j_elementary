package ru.job4j.array2;

public class ArrayDefinition2 {
    public static void main(String[] args) {
       short[] ages = new short[10];
       String[] surnames = new String[100500];
       float[] prices = new float[40];

       String[] names = new String[4];
       names[0] = "Mary";
       names[1] = "Olga";
       names[2] = "Vlad";
       names[3] = "Ivan";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
