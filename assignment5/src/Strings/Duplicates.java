package Strings;

public class Duplicates {

	public static void main(String[] args) {
		String str="bytecodebod";
		char[] c=str.toCharArray();
//		System.out.println(c);
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.print(c[i]);
					break;
				}
			}
		}
	}

}
