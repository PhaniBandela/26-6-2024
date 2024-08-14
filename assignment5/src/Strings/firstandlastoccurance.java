package Strings;

/*
 * •Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
 */
public class firstandlastoccurance {

	public static void main(String[] args) {
		String str="Hello, word";
//		first occurance
		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf(','));
//		last occurance
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.lastIndexOf(','));
		
		int of=-1,cf=-1;
		int ol=-1,cl=-1;
		
		for(int i=0;i<str.length();i++) {
			char cc=str.charAt(i);
			if(cc=='o') {
				if(of==-1) {
					of=i;
				}
				ol=i;
			}
			if(cc==',') {
				if(cf==-1) {
					cf=i;
				}
				cl=i;
			}
		}
		System.out.println(of+" "+cf+" "+ol+" "+cl);
	}

}
