package ru.job4j.calculator2;

import java.util.Stack;

public class ArgMethod2 {
    public static void hello(String name) {
        System.out.println("Hello, " + name);

    }

    public static void main(String[] args) {
        String name =  "Petr Arsentev";
        int age = 33;
        ArgMethod2.hello(name);
    }

}
