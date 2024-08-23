package mocktest;

import java.util.*;

public class largestpalindrom {

	static boolean Palindrome(String str) {
		int j=str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			j--;
		}
		
		return true;
	}
	static String LargestPalindrome(String[] s) {
		
		String large=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null && large.length()<s[i].length()) {
				large=s[i];
			}
		}
		
		return large;
		
	}

	public static void main(String[] args) {

		String s="this is madam aba malayalam";
		String s1[]=new String[s.length()];
		int i=0;
		for(String str:s.split(" ")) {
			boolean b=Palindrome(str);
			if(b==true) {
				s1[i++]=str;
			}
		}
		System.out.println(LargestPalindrome(s1));
		
	}

}
