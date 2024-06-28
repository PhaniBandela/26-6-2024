package assignment4;

public class Oddfrom50to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=50;i<100;i++) {
			if(i==53|| i==77|| i==97)
				continue;
			if(i%2==1)
				System.out.println(i);
		}
	}

}
