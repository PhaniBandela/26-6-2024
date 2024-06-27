package assignment3;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean marrage=false;
		int age=29;
		char a='m';
		if(marrage==false) {
			if(a=='m' && age>30||a=='f' && age>25) {
				System.out.println("insures");}
			else {
				System.out.println("not insure");
			}
			}
		else if(marrage!=false){
			System.out.println("insures");
		}

	}

}
