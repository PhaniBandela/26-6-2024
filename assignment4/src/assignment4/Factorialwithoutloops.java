package assignment4;

public class Factorialwithoutloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=31;
		int a=fact(n);
		System.out.println(a);
	}
	public static int fact(int n) {
		if(n!=0) {
			n=n*fact(n-1);
			return n;
		}
		return 1;
	}

}
