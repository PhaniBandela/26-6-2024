package assignment5;

public class removeduplicatesinarray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,3,3,5};
		val(arr);
		}
	
	
	static int countt(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int a=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) 
					a++;
			}
			if(a==0)
				count++;
		}
		return count;
	}
	
	
	static void val(int arr[]) {
		int b=countt(arr);
		System.out.println(b);
		int arr1[]=new int[b];
		int n=0;
		for(int i=0;i<arr.length;i++) {
			int a=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) 
					a++;
			}
			if(a==0) {
				arr1[n]=arr[i];
				System.out.print(arr1[n]+" ");
				n++;
			}
		}
	}
}
