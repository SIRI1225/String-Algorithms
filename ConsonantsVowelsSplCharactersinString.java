package com.stringoperations;

public class ConsonantsVowelsSplCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi&Hru?Join_The*Class!";
		System.out.println(str);
		int length = str.length();
		System.out.println(length);

		int vowels = 0, consonants = 0, splcharacters = 0;
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println();
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);

			if ((ch >= 'b' && ch <= 'z' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')) {
				++consonants;
			}

			else if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
				++vowels;
			} else {
				++splcharacters;
			}

		}
		System.out.println("Consonants: " + consonants);
		System.out.println("Vowels: " + vowels);
		System.out.println("Special Characters: " + splcharacters);

	}

}
