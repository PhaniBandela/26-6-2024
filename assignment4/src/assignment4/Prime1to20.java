package assignment4;

public class Prime1to20 {

	public static void main(String[] args) {
//		int n=80,count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0)
//				count++;
//		}
//		if(count==2)
//			System.out.println("prime");
//		else
//			System.out.println("not");
			int count=0,n=20;
			for(int i=1;i<=n;i++) {
				if(i==2) {
				continue;
				}
				count=0;
			
			for(int j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					count++;
				
				}
				
			}
			if(count==2) {
				System.out.println(i);
			}
			
			
				}
			
		}

	}