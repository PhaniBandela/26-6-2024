package assignment5;

public class arithmethicoperatorsinarray {

	public static void main(String[] args) {
		int arr1[]= {1,2},arr2[]= {3,4};
		int arr3[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
			System.out.print(arr3[i]+" ");
			arr3[i]=arr1[i]-arr2[i];
			System.out.print(arr3[i]+" ");
			arr3[i]=arr1[i]*arr2[i];
			System.out.print(arr3[i]+" ");
			arr3[i]=arr1[i]/arr2[i];
			System.out.print(arr3[i]+" ");
			arr3[i]=arr1[i]%arr2[i];
			System.out.print(arr3[i]+" ");
			System.out.println();
		}
		
	}

}
