package assignment5;
//1.	Write a java program to find the sum of all elements.

public class SumofelementsinArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,5},n=0;
		for(int i=0;i<arr.length;i++) {
			n=arr[i]+n;
		}
		System.out.println(n);
	}

}
