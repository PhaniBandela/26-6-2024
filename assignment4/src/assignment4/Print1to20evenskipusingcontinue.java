package assignment4;

public class Print1to20evenskipusingcontinue {

	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			if(i%2==1)
				continue;
			System.out.println(i);
		}

	}

}
