package Strings;

public class reverswordString {

	static void revword(char c[]) {
		int no=c.length;
		char a[]=new char[no];
		for(int i=0;i<c.length;i++) {
			a[i]=c[no-1];
			no--;
		}
		System.out.print(a);
		System.out.print(" ");
	}
	public static void main(String[] args) {
		String s="java institute hyderabad";
		for(String str:s.split(" ")) {
			char c[]=str.toCharArray();
		    revword(c);
		}

	}

}
