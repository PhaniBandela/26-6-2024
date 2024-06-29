package assignment4;

public class Librarycharge {

	public static void main(String[] args) {

		int days=6;
		double charge=30;
		String account="had";
		if(account=="")
		{
			if(days>30)
				System.out.println("cancle subscription");
			else if(days>10)
				charge+=5;
			else if(days>6 && days <10)
				charge+=1;
			else if(days>5)
				charge+=0.5;
			System.out.println("total bill is: "+charge);
		}
		else
			System.out.println("create an library account");
		
	}

}
