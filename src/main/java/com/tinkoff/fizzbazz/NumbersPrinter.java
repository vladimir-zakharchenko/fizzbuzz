package com.tinkoff.fizzbazz;

public class NumbersPrinter {

    private static final String MULTIPLE_OF_THREE = "Fizz";
    private static final String MULTIPLE_OF_FIVE = "Buzz";

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.print(MULTIPLE_OF_THREE);
            }

            if (i % 5 == 0) {
                System.out.print(MULTIPLE_OF_FIVE);
            }

            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
