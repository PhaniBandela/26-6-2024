package DupMisNthlarge;

public class task {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		char arr2[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		char arr3[][]= {{'#','$','%'},{'^','&','*'},{'!','@','('}};
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(i==0 && j==0)
				System.out.print(arr1[i][j]+" ");
				if(j==1 && i==0)
				System.out.print(arr2[i][j]+" ");
				if(i==2 && j==0)
				System.out.print(arr3[i][j]+" ");
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(i==0 && j==1)
				System.out.print(arr1[i][j]+" ");
				if(j==1 && i==1)
				System.out.print(arr2[i][j]+" ");
				if(i==2 && j==1)
				System.out.print(arr3[i][j]+" ");
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(i==0 && j==2)
				System.out.print(arr1[i][j]+" ");
				if(j==1 && i==2)
				System.out.print(arr2[i][j]+" ");
				if(i==2 && j==2)
				System.out.print(arr3[i][j]+" ");
			}
		}
		
	}

}
