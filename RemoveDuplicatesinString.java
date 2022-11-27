package com.stringoperations;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "GUESSINGGAME";
		System.out.println("Original String is ::"+" "+s1);
		 String s2 = "";
	        for (int i = 0; i < s1.length(); i++) {
	            Boolean found = false;
	            for (int j = 0; j < s2.length(); j++) {
	                if (s1.charAt(i) == s2.charAt(j)) {
	                    found = true;
	                    break; 
	                }
	            }
	            if (found == false) {
	                s2 = s2.concat(String.valueOf(s1.charAt(i)));
	            }
	        }
	        System.out.println("String after duplicates removal::"+" "+ s2);

		

	}

}
