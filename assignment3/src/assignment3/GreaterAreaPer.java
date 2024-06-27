package assignment3;

public class GreaterAreaPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side=4;
		int area=side*side;
		int perimeter=4*side;
		if(area>perimeter)
			System.out.println("area is bigger: "+area);
		else if(perimeter>area)
			System.out.println("perimeter is bigger: "+perimeter);
		else if(area==perimeter)
			System.out.println("both are same");
		else
			System.out.println("enter valid");

	}

}
