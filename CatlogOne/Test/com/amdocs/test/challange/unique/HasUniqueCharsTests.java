package com.amdocs.test.challange.unique;

import org.junit.Test;
import static org.junit.Assert.*;

public class HasUniqueCharsTests {
	@Test
	public void shouldReturnTrueWhenAllAreUnique() {
		boolean expected = true;
		boolean actual = Challenge.hasUniqueChars("abcdefghijklm");
		assertEquals(expected, actual);
		expected = true;
		actual = Challenge.hasUniqueChars(" abcC");
		assertEquals(expected, actual);
		expected = true;
		actual = Challenge.hasUniqueChars("iopkgysrwTn");
		assertEquals(expected, actual);
		expected = true;
		actual = Challenge.hasUniqueChars("903kslgoHjREW");
		assertEquals(expected, actual);
		expected = true;
		actual = Challenge.hasUniqueChars("");
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnFalseWhenAllAreNotUnique() {
		boolean expected = false;
		boolean actual = Challenge.hasUniqueChars("abb");
		assertEquals(expected, actual);

		expected = false;
		actual = Challenge.hasUniqueChars("  ");
		assertEquals(expected, actual);
		expected = false;
		actual = Challenge.hasUniqueChars("apdofjeuafy");
		assertEquals(expected, actual);
	}
}
