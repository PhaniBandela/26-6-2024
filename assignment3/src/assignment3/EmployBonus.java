package assignment3;

public class EmployBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years=30;
		if(years!=0 && years<5) {
			System.out.println("hike is 2500");}
		if(years>=5 && years<10) {
			System.out.println("hike is 3000");}
		if(years>=10 && years<20) {
			System.out.println("hike is 3500");}
		if(years>=20 &&years<40) {
			System.out.println("hike is 5000");}
		else
			System.out.println("enter correct experince");

	}

}
