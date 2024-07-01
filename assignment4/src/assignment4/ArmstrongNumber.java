package assignment4;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1634,count=0,temp=n,sum=0,m=0;
		while(n>0) {
			n/=10;
			count++;
		}
		n=temp;
		while(n>0) {
			m=n%10;
			sum=sum+(int)Math.pow(m,count);
			n/=10;
			
		}
		if(temp==sum)
			System.out.println("arm");
		else
			System.out.println("not");


	}

}
