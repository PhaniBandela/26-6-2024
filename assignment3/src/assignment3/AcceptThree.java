package assignment3;

public class AcceptThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=40,c=60;
		if(a<b && b<c) {
			System.out.println("incending");
		}
		else if(c<a && b<a) {
			System.out.println("decreasing");
		}
		else{
			System.out.println("not an order");}
	}

}
