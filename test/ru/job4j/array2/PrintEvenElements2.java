package ru.job4j.array2;

public class PrintEvenElements2 {

        public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
           if (i % 2 == 0) {
               System.out.println("этот элемент с четным индексом "  + numbers[numbers.length - 1 - i]);
           }

        }

    }
}
