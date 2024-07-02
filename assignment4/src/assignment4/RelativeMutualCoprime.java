package assignment4;

public class RelativeMutualCoprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,m=7,count=0;
		for(int i=1;i<=n||i<=m;i++) {
			if(n%i==0) {
			if(m%i==0) {
				count++;
				}}
		}
		if(count==2)
			System.out.println("same");
		else if(count>1)
			System.out.println("not");
		else if(count==1)
			System.out.println("coprime");
		
	}

}
