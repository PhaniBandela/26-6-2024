package mocktest;

public class secondrepeted {

	public static void main(String[] args) {
		String s="abcdefabdebaa";
		char[] s1=new char[125];
		int i=0;
		for(char str:s.toCharArray()) {
			s1[str]++;
		}

	}

}
