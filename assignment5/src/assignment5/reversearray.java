//4.	Write  a program to reverse  the array.
package assignment5;

public class reversearray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,5},arr1[]=new int[arr.length],len=arr.length;
		for(int i=0;i<arr.length;i++) {
			arr1[len-1]=arr[i];
			len--;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
