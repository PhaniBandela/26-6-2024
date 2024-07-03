package assignment4;

public class Perfectumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,sum=0,temp=n;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
				//System.out.println(sum);
		}
		if(sum==temp)
			System.out.println("perfect");
		else
			System.out.println("not");
	}

}
