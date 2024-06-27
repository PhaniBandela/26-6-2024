package assignment3;

public class AlphabetDigitChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='7';
		if(a>='a'&&a<='z'||a>='A'&&a<='Z')
			System.out.println("alphabet");
		else if(a>='0'&&a<='9')
			System.out.println("digit");
		else
			System.out.println("char");
	}

}
