package MethodAssignment;

public class classinsideclass {
	
	//static variable
	static String companyname;
	
	//instance variable
	int empid=100;
	
	//static global object
	static classinsideclass obj=new classinsideclass();
	
	//static block
	static {
		System.out.println("Static Block");
		companyname="TCS";
	}
	//static method
	public static void display1() {
		System.out.println("Static Method");
	}
	//instance method
	public void display2() {
		System.out.println("Instance Method");
		
	}
	//pre-defined main method
	public static void main(String[] args) {
		
		//printing static variable
		System.out.println(companyname);
		
		//printing instance variable
		System.out.println(obj.empid);
		
		//calling static method
		display1();
		
		//calling instance method
		obj.display2();
		
		//calling outside class with static method
		Outsideclass.outside();
		
		//calling outside class with instance method
		Outsideclass out=new Outsideclass();
		out.outside();
		
		
		
	}

}
//out side class
 class Outsideclass{
	public static void outside() {
		System.out.println("outside class");
		
		//calling instance variable
		System.out.println(classinsideclass.obj.empid);
		
		//calling static variable
		System.out.println(classinsideclass.companyname);
		
		//calling instance method
		classinsideclass.obj.display2();
		
		//calling static method
		classinsideclass.display1();
		
	}
}
