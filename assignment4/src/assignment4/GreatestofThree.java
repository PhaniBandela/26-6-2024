package assignment4;

public class GreatestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=40,b=140,c=80;
		if(s>b && s>c)
			System.out.println("the gratest: "+s);
		else if(b>s && b>c)
			System.out.println("the gratest is: "+b);
		else if(c>s && c>b)
			System.out.println("the greatest is:"+c);
		else if(s==b ||s==c||b==c) {
			System.out.println("some are equal");
		}
	}

}
