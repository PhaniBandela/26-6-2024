package assignment4;

public class EvenOddusingDoWhile {

	public static void main(String[] args) {
		int n=10,sum=0,i=1;
		do {
			sum+=i;
			i++;
		}while(i<=n);
		System.out.println(sum);
	}

}
