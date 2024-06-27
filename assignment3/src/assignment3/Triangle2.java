package assignment3;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=80,b=80,c=60,d=a+b+c;
		if(d==180) {
			if(a==b&& a==c)
				System.out.println("equilateral");
			else if(a==b || a==c)
				System.out.println("isoleteral");
			else
				System.out.println("scalent");
		}
		else
			System.out.println("not a triangle");
		

	}

}
