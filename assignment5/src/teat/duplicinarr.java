package teat;
/*
 * 1.	Program to find 
Case 1: 
             To Find Duplicate elements and print highest number of repeated element
Case 2:
           Remove Duplicates and Print the Array.
Input Array: int a[]={1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};

 */
public class duplicinarr {
	
	

	public static void main(String[] args) {
		int a[]={1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
		int b[]=new int[a.length];
		int count,max=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			b[i]=count;
		}
		max=b[0];
		for(int i=1;i<b.length;i++) {
			System.out.print(b[i]+" ");
			if(max<b[i])
				max=b[i];
		}
		System.out.println(max);
		
		duplicinarr obj=new duplicinarr();
		
		for(int i=0;i<a.length;i++) {
			obj.dupl(a,i);
		}

	}
	
	void dupl(int a[],int i) {
		
		for(int j=0;j<a.length;j++) {
			for(int k=0;k<a.length;k++) {
				
			}
		}
	}

}
