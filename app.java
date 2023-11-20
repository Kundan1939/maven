package dev.gauravkumar;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        System.out.println("Sum of " + Arrays.toString(args).substring(1, Arrays.toString(args).length() - 1) + " is: " + sum(args));
    }

    public static int sum(String[] args) {
        return Arrays.stream(args).mapToInt(Integer::parseInt).sum();
    }
}
