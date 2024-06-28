package assignment4;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,n=10;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<n;i++) {
			c=a+b;
			if(c!=13 && c!=34)
				System.out.println(c);
			a=b;
			b=c;
		}
	}

}
