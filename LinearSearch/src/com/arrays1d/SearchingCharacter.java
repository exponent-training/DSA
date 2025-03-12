package com.arrays1d;

public class SearchingCharacter {

	static boolean search(String str, char search) {

		if (str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == search) { // checks in current index which is i what character the string has
				return true;
			}
		}
		return false;
	}

	// using for each
	static boolean search2(String str, char search) {

		for (char ch : str.toCharArray()) { // since we can iterate only array or collection in for each we need to
											// convert it into character array
			if (search == ch) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "Sumi";

		char ch = 'i';

		// System.out.println(search(str, ch));
		System.out.println(search2(str, ch));
	}

}
