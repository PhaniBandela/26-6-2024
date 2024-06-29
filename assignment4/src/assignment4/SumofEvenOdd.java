package assignment4;

public class SumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,sum1=0,sum2=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				sum1+=i;
			else
				sum2+=i;
		}
		System.out.println("even sum="+sum1);
		System.out.println("odd sum="+sum2);
	}

}
