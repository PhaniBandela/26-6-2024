package Constructors;
/*3.Write a Java class called Rectangle with private fields for length and width. Create
a constructor that takes in a length and width as parameters and initializes the fields.
Also, create a method called calculateArea that returns the area of the rectangle
(length * width).*/
public class Rectangle {
	private int length;
	private int width;
	
	static Rectangle obj=null;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public static int calculateArea() {
		int area=obj.length*obj.width;
		return area;
	}
	public static void main(String[] args) {
		obj=new Rectangle(55,45);
		System.out.println(calculateArea());
	}

}
