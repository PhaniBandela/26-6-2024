package assignment4;

public class SumofOdd {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		int n=10,sum=0;
		for(int i=1;i<=(n*2);i++) {
			if(i%2==1) {
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}

}
