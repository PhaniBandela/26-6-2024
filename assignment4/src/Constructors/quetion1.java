package Constructors;
/*1.Write a Java class called Person with private fields for name and age. Create a
constructor that takes in a name and age as parameters and initializes the fields.
Also, create a method called introduce that prints out a message introducing the
person with their name and age.*/
public class quetion1 {
	private String name;
	private int age;
	static quetion1 obj=null;
	
	quetion1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void introduce() {
		System.out.println("hello my name is "+obj.name+" and my age is "+obj.age+" years old");
	}
	
	public static void main(String[] args) {
		obj=new quetion1("A",25);
		introduce();
	}
}
