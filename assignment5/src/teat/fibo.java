package teat;

public class fibo {

	public static void main(String[] args) {
		int sum=1,n=5;
		for(int i=1;i<=n;i++) {
			if(sum==54) 
				break;
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
