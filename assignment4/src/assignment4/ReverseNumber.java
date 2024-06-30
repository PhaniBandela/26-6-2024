package assignment4;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456789,m=0,rev=0,temp=n;
		while(n>0) {
			m=n%10;
			rev=m+rev*10;
			n/=10;
		}
		System.out.println(rev);
		
	}

}
