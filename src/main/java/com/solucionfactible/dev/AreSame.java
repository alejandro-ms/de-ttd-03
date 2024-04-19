package com.solucionfactible.dev;


/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {

	public static boolean comp(int[] a, int[] b) {

		try {
			if (a.length != b.length) throw new RuntimeException("The length two arrays is different");
			int cont = 0;
			for (int num : a) {
				for(int value : b) {
					if(Math.pow(num, 2) == value) {
						cont++;
						break;
					}
				}

			}
			return cont == a.length;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

