package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 *
 * @author developer
 */
public class ArrayDiff {

	public static int[] diff(int[] a, int[] b) {
		try{
		List<Integer> integerList = new ArrayList<>();
		for (int num : a) {
			boolean found = false;
			for (int value : b) {
				if (num == value) {
					found = true;
					break;
				}
			}
			if (!found) {
				integerList.add(num);
			}
		}

		return integerList.stream().mapToInt(i -> i).toArray();
		} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
