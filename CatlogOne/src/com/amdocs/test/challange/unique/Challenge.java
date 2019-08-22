
package com.amdocs.test.challange.unique;

import java.util.Arrays;

public class Challenge {

	public static boolean hasUniqueChars(String inputStr) {

		if (inputStr == null) {
			return false;
		}
		char[] chArray = inputStr.toCharArray();
		//lets convert this char to ASCII values
		//really required ?
		int[] assciValues = new int[chArray.length];

		for (int i = 0; i < chArray.length; i++) {
			assciValues[i] = chArray[i];
		}

		// Using sorting
		// Arrays.sort() uses binarySort in the background
		// for non-primitives which is of O(nlogn) time complexity
		Arrays.sort(assciValues);

		for (int i = 0; i < assciValues.length - 1; i++) {
			// if the adjacent elements are not
			// equal, move to next element
			if (assciValues[i] != assciValues[i + 1])
				continue;

			// if at any time, 2 adjacent elements
			// become equal, return false
			else return false;
		}
		return true;

	}
}
