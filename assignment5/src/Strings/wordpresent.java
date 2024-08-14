package Strings;

public class wordpresent {

	 static boolean ispresent(String s[],String str1){
		for(int i=0;i<s.length;i++) {
			if(str1.equals(s[i])) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str="This is orange juice";
		String str1="orange";
		String s[]=str.split(" ");
		boolean res=ispresent(s,str1);

		if(res==true)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
