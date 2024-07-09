package DupMisNthlarge;

public class MissingNumber {
	
	public static void main(String[] args) {
		int arr[]= {9,1,3,4,6,7,8};
		for(int key=1;key<=10;key++) {
			boolean present=checkelement(arr,key);
			if(present==false) {
				System.out.print(key+" ");
			    continue;
			}
		}

	}
	static boolean checkelement(int []arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return true;
		}
		return false;
	}

}
