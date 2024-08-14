package teat;

import java.util.Arrays;

/*
 * 9.	Write a program to print table 5.
1: store even multiple values in one array and odd multiple values in other array
2: Merge Both The arrays in to single array

3: Find the sum of total elements of the array.

4. Find the sum is duck number or not.

 */

public class table5 {

	public static void main(String[] args) {
		int n=10,m=5,sum=1,j=0,k=0;
		int even[]=new int[n],odd[]=new int[n],arr[]=new int[n];
		
//		store even multiple values in one array and odd multiple values in other array
		
		for(int i=1;i<=n;i++) {
			sum=m*i;
			if(sum%2==0)
				even[j++]=sum;
			else
				odd[k++]=sum;
		}
		
//		Merge Both The arrays in to single array

		k=j=0;
		for(int i=0;i<even.length;) {
			  arr[i++]=  odd[j++];
			  arr[i++]=even[k++];
		}
		System.out.println(Arrays.toString(arr));
		
//		 Find the sum of total elements of the array.
		sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=odd[i]+even[i]+sum;
		}
		System.out.println(sum);
		
//		Find the sum is duck number or not.
		
		if(sum%10==0)
			System.out.println("duck");
		else
			System.out.println("not");
	}

}
