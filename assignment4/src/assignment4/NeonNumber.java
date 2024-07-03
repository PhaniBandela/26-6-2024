package assignment4;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		
		int sum=1,m=0,digit=0,temp=n;
		sum=n*n;
		while(sum>0) {
			m=sum%10;
			digit+=m;
			sum/=10;
		}
		if(digit==temp)
			System.out.println("neon");
		else
			System.out.println("not");
		
	}

}
