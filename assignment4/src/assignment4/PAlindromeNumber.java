package assignment4;

public class PAlindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=21;
		
		int digit=0,sum=0,m=0,temp=n;
		while(n>0) {
			m=n%10;
			sum=m+sum*10;
			n/=10;
		}
		if(sum==temp)
			System.out.println("palindrome");
		else
			System.out.println("not");

	}

}
