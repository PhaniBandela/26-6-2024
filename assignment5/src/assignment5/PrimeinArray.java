package assignment5;
import java.util.Scanner;
public class PrimeinArray {

	public static void main(String[] args) {
		prime();
	}
	 public static void prime() {
			int count=0,a=0;
			System.out.println("enter length");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=1;i<=999999999;i++) {
				count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) 
						count++;
				}
				if(count==2 && a<n ) {
						arr[a]=i;
						System.out.print(arr[a++]+" ");
				}
			}
		}

}

