package com.amdocs.test.challange.unique;

public class MarkdownParser {

	public static String markdownParser(String inputStr) {
		String orignalInput = inputStr;
		inputStr = inputStr.trim();
		String[] splitArray = inputStr.split(" ", 2);
		boolean allHash = true;

		if (splitArray.length < 1) {
			return orignalInput;
		}
		String firstWord = splitArray[0];
		for (int i = 0; i < firstWord.length(); i++) {
			if (inputStr.charAt(i) != '#') {
				allHash = false;
				break;
			}
		}
		if (!allHash || firstWord.length() > 6) {
			return orignalInput;
		}

		String upd = new StringBuilder("<h" + firstWord.length() + ">")
			.append(inputStr.subSequence(firstWord.length() + 1, inputStr.length()))
			.append("</h" + firstWord.length() + ">").toString();
		return upd;

	}

}
