package assignment4;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,n=10;
		System.out.print(a+",");
		System.out.print(b+",");
		for(int i=1;i<n;i++) {
			c=a+b;
			if(c!=13 && c!=34)
				System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
