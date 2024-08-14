package Strings;

import java.util.Arrays;

public class anagramornot {

	public static void main(String[] args) {
		String s1="silent";
		String s2="iltens";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c2,c1)) {
			System.out.println("ana");
		}
		}

}
