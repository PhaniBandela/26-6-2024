package assignment4;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=70,s2=80,s3=90;
		int avg=(s1+s2+s3)/3;
		if(avg>0 && avg<=100) {
			if(avg>=80)
				System.out.println("A grade");
			else if(avg>=60)
				System.out.println("B grade");
			else if(avg>=40)
				System.out.println("c grade");
			else if(avg<40)
				System.out.println("D grade");
		}
		else
			System.out.println("enter valid score");

	}

}
