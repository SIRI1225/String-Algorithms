package com.stringoperations;

public class PangramChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String s1 = "Sixty Zippers were quickly picked from the Woven jute bag";
		s1 = s1.toUpperCase().replaceAll(" ", "");
		System.out.println("String s1 after removal of spaces and to lowercase" + " " + s1);

		char[] ch = s1.toCharArray();
		int[] ar = new int[26];
		for (int i = 0; i < ch.length; i++) {
			int index = ch[i] - 65;
			ar[index]++;

		}
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == 0) {
				System.out.println("s1 is not a panagram");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("s1 is Pangram");
		}

	}

}
