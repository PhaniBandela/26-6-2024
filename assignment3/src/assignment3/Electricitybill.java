package assignment3;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units=33;
		double cost=0;
		if(units>=0 && units<=100) 
			cost=units*1.5;
		else if(units>100 && units<=200)
			cost=units*2.0;
		else if(units>200)
			cost=units*3;
		else if(units<0)
			System.out.println("enter valid units");
		 System.out.println("your bill is"+cost);
		

	}

}
