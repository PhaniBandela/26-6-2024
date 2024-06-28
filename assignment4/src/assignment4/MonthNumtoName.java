package assignment4;

public class MonthNumtoName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=1;
		String name="";
		if(month>0 && month<=12) {
			switch(month) {
			case 1:
				name="jan";
			case 2:
				name="feb";
			case 3:
				name="mar";
			case 4:
				name="apr";
			case 5:
				name="may";
			case 6:
				name="june";
			case 7:
				name="july";
			case 8:
				name="aug";
			case 9:
				name="sep";
			case 10:
				name="oct";
			case 11:
				name="nov";
			case 12:
				name="dec";
			}	
			System.out.println("month is:  "+name);
		}
		else
			System.out.println("enter correct number");

	}

}
