package com.amdocs.test.challange.unique;

import java.util.Arrays;

public class CalculateRotation {

	/*
	 * Function checks if passed strings (str1 and str2) are rotations of each
	 * other
	 */
	static int shiftedDiff(String first, String second) {
		// There lengths must be same and str2 must be
		// a substring of str1 concatenated with str1.
	//	if ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1)) {
	//		return (str1.length() - (str1 + str1).indexOf(str2));
	//	}
		
		int shift = first.concat(first).lastIndexOf(second);
		char[] a = first.toCharArray();
		char[] b = second.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return shift > -1 && Arrays.equals(a, b) ? first.length() - shift : -1;
	}

}
