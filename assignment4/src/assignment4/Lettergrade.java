package assignment4;

public class Lettergrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=-10;
		if(score>0 && score<=100) {
			if(score>80)
				System.out.println("A grade");
			else if(score>60)
				System.out.println("B grade");
			else if(score>40)
				System.out.println("c grade");
			else if(score<40)
				System.out.println("D grade");
		}
		else
			System.out.println("enter valid score");

	}

}
