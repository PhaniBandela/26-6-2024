package assignment4;

public class OddExclude3Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			if(i%2==1 && i%3!=0)
					System.out.println(i);
		}

	}

}