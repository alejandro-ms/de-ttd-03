package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number
 * of times you must multiply the digits in num until you reach a single digit.
 *
 * @author developer
 */
public class Persistence {
    public static int persistence(long number) {
        if (number < 0) throw new IllegalArgumentException("Negative values are not allowed");

        String numberAsString = Long.toString(number);

        if (numberAsString.length() == 1) {
            return 0;
        }

        int productOfDigits = calculateProductOfDigits(numberAsString);

        return 1 + persistence(productOfDigits);
    }

    private static int calculateProductOfDigits(String numberAsString) {
        int product = 1;

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Character.getNumericValue(numberAsString.charAt(i));
            product *= digit;
        }

        return product;
    }

}
