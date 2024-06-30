package assignment4;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0321,m=0;
		while(n>0) {
			m=n%10;
			if(m==0) {
				System.out.println("duck");break;}
			n/=10;
		}
	}

}
