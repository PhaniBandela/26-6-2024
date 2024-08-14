package teat;
/*
 * For example, if number is 156, then sum of its digit will be 1 + 5 + 6 = 12.
 *  Since 156 is divisible by 12. So, 156 is a Harshad number.
 */
public class harshednumber {
	
	int num(int n) {
		int a=0,sum=0;
		while(n>0) {
			a=n%10;
			sum+=a;
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n=0;
		harshednumber obj=new harshednumber();
		int res=obj.num(n);
		if(res==0)
			System.out.println("num less");
		else if(n%res==0) 
			System.out.println("has");
		else if(n%res!=0)
			System.out.println("not");
	}

}
