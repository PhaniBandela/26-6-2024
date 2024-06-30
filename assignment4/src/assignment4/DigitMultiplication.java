package assignment4;

public class DigitMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456,m=0,sum=1;
		while(n>0) {
			m=n%10;
			sum*=m;
			n/=10;
		}
		System.out.println(sum);
	}

}
