package assignment3;

public class persentage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per=20;
		if(per>=80 && per<=100)
			System.out.println("DIVISION 1");
		else if(per>=60 && per<80)
			System.out.println("DIVISION 2");
		else if(per>=40 && per<60)
			System.out.println("DIVISION 3");
		else if(per>=35 && per<40)
			System.out.println("DIVISION 4");
		else if(per<35 && per>=0)
			System.out.println("REWRITE EXAM");
		else
			System.out.println("enter between 1-100");

	}

}
