package teat;

import java.util.Arrays;

/*
 * 3.	Program to find highest Palindrome number from the given array
    Input Array: {2357, 568568, 1238321, 2325532};

 */
public class highestpalin {

	public int palin(int arr[],int i) {
		int a=0,sum=0,temp=arr[i];
		while(arr[i]>0) {
			a=arr[i]%10;
			sum=sum*10+a;
			arr[i]/=10;
		}
		if(sum==temp)
			return sum;
		return 0;
	}
	public static void main(String[] args) {
		
		highestpalin obj=new highestpalin();
		
		int arr[]= {2357, 568568, 1238321, 2325532,121,123454321};
		int ar1[]=new int[arr.length];
		int l=0,j=0;
		
		for(int i=0;i<arr.length;i++) {
			ar1[l++]=obj.palin(arr,i);
		}

		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]>ar1[j]) {
				ar1[j]=ar1[i]; 
			}
		}
		System.out.println(ar1[0]);
	}

}
