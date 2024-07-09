package DupMisNthlarge;

public class NthLarge {

	public static void main(String[] args) {
		int a[]= {1,3,4,6,2,7,5,55},n=2,temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {  //if(a[i]>a[j])
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-n]);

	}

}
