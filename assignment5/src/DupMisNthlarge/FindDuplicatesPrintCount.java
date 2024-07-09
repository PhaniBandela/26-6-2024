package DupMisNthlarge;

public class FindDuplicatesPrintCount {

	public static void main(String[] args) {

		int a[]= {4,6,9,4,5,2,4},count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) 
					   count++;
			}
		}System.out.println(count);
	}

}
