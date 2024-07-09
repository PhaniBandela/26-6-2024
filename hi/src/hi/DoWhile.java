package hi;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=0;
		
		do {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		while(scan.nextBoolean());
	}

}
