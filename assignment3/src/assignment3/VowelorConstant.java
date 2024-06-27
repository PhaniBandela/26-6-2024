package assignment3;

public class VowelorConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=' ';
		if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
			System.out.println("vowel");
		else if(a>='a'&&a<='z'||a>='A'&&a<='Z')
			System.out.println("constant");
		else
			System.out.println("check");
		

	}

}
