package assignment3;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per=200;
		if(per>=80 && per<=100)
			System.out.println("grade A");
		else if(per>=60 && per<80)
			System.out.println("grade B");
		else if(per>=40 && per<60)
			System.out.println("grade C");
		else if(per>=35 && per<40)
			System.out.println("grade D");
		else if(per<35 && per>=0)
			System.out.println("grade F");
		else
			System.out.println("enter between 1-100");

	}

}
