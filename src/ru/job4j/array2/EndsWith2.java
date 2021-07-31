package ru.job4j.array2;

public class EndsWith2 {
    public static boolean endsWit(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
