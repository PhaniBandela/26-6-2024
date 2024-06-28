package assignment4;

public class SideofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,b=15,c=15;
		if(a>0&&b>0&&c>0) {
			if(a==b && a==c)
				System.out.println("regular");
			else if(a==b||b==c||a==c)
				System.out.println("symmetrical");
			else if(a!=b && a!=c || b!=c&&b!=a||c!=a&&c!=b)
				System.out.println("irregular");
		}
		else
			System.out.println("enter correct values");
			

	}

}
