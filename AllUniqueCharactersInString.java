package com.stringoperations;

public class AllUniqueCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HiGodMustCrazy";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println("String has duplicate characters");
				}
			}

		}
		System.out.println("All characters are unique in the given string");

	}

}
