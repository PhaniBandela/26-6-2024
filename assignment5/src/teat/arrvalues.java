package teat;
/*
 * 2.	Program to place the values in the array as:
       •	Even Numbers in the even place
       •	Odd numbers in the odd place 
       •	Zero’s at the end positions of the array
       Input Array: int a[]={1,3,2,4,5,2,8,0,1,0,3,7,8,9,0};

 */
public class arrvalues {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,4,5,2,8,0,1,0,3,7,8,9,0};
		int bc=0,oc=0,zc=0,n=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				zc++;
			}
			else if(a[i]%2==1) {
				oc++;
			}
			else if(a[i]%2==0) {
				bc++;
			}
		}
		int b[]=new int[bc];
		int odd[]=new int [oc];
		int zero[]=new int [zc];
		bc=oc=zc=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				zero[zc]=a[i];
				zc++;
			}
			else if(a[i]%2==1) {
				odd[oc]=a[i];
				oc++;
			}
			else if(a[i]%2==0) {
				b[bc]=a[i];
				bc++;
			}
		}
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		for(int i=0;i<odd.length;i++)
			System.out.print(odd[i]+" ");
		System.out.println();
		for(int i=0;i<zero.length;i++)
			System.out.print(zero[i]+" ");
		System.out.println();
		for(int i=1;i<=a.length;i++) {
			if(i%2==1 && i<=bc) {
				a[i]=b[n];
				n++;
			}
			else if(i%2==0 && i<=oc) {
				a[i]=odd[n];
				n++;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
