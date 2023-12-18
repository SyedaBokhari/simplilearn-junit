package com.simplilearn.junit;

public class _02_Checker {
	
	 boolean isPalindrome(String str) {

	        /*
	         * A Palindrome is a string with reverse is equal to the original string.
	         * for example pop, racecar, Anna
	         * 
	         * StringBuilder has the reverse method.
	         */

	        StringBuilder stb = new StringBuilder(str);

	        String rev = stb.reverse().toString();

	        return str.equals(rev);
	    }
} 


/* Palindrome code 
 
  String str = "Radar", reverseStr = "";

int strLength = str.length();

for (int i = (strLength - 1); i >=0; --i) {
  reverseStr = reverseStr + str.charAt(i);
}

if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
  System.out.println(str + " is a Palindrome String.");
}
else {
  System.out.println(str + " is not a Palindrome String.");
}
 * 
 

*/