package com.solucionfactible.dev;

import java.util.ArrayList;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 *
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {
		if(array.length == 1) throw new IllegalArgumentException("It's necessary at least 2 characters");

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] + 1 != array[i + 1]) {
				return (char)(array[i] + 1);
			}
		}

		throw new NullPointerException("Error probably value is null");
	}
}
