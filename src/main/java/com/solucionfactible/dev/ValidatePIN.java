package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	public static boolean isValid(String pin) {
		// Regex explanation:
		// "\\d{4}(\\d{2})?" ensures that the input string is exactly four digits, or exactly six digits:
		// "\\d{4}" - Requires the first four characters to be digits (0-9).
		// "(\\d{2})?" - Allows an optional group of exactly two additional digits, making the total six.
		return pin.matches("\\d{4}(\\d{2})?");
	}

}
