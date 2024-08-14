package Strings;

public class removeSpaces {

	public static void main(String[] args) {
		String str="This   is     my book";
		char c[]=str.toCharArray();
		String s="";
		System.out.println(c);
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ' || c[i+1]!=' ') {
				s+=c[i];
			}
		}
		System.out.println(s);
	}

}
