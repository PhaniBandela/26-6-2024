package assignment5;
//6.	Write a program to merge two arrays.
import java.util.Scanner;
public class mergetwoarrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr1[]= {1,2,3},arr2[]= {4,5,9,6},arr3[]=new int[arr1.length+arr2.length],a=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[a]=arr1[i];
			a++;
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[a]=arr2[i];
			a++;
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
