package assignment4;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2004;
		if(year%4==0 && year%400==0 || year%100!=0) 
			System.out.println("leap");
		else
			System.out.println("not");

	}

}
