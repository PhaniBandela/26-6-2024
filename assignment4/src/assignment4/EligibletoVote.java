package assignment4;

public class EligibletoVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nation="INDIA";
		int age=18;
		if(nation=="india" || nation=="INDIA") {
			if(age>=18) {
				System.out.println("eligible to VOTE");
			}
			else
				System.out.println("age not eligible");
		}
		else
			System.out.println("nation doesn't match");
	}

}
