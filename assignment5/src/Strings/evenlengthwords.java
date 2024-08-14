package Strings;

public class evenlengthwords {

	public static void main(String[] args) {
		String str="this is java";
		for(String s:str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}

	}

}
