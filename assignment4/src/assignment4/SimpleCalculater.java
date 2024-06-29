package assignment4;

public class SimpleCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		char opp='%';
		switch(opp) {
		case '+':
			a+=b;
			break;
		case '-':
			a-=b;
			break;
		case '*':
			a*=b;
			break;
		case '/':
			if(b==0) {
				System.out.println("infinate");
			return ;}
			a/=b;
			break;
		case '%':
			if(b==0) {
				System.out.println("infinate");
				return;}
			a%=b;
			break;
		default:
			System.out.println("enter opperators like '+' '-' '*' '/' '%'");
		}
		System.out.println(a);

	}

}
