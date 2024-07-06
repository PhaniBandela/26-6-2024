package Constructors;
/*4.Write a Java class called Student with private fields for name, age, and GPA.
Create two constructors - one that takes in a name, age, and GPA as parameters and
initializes the fields, and another that takes in just a name and age as parameters
and sets the GPA to 0.0. Also, create a method called displayGPA that prints out the
student's GPA.*/
public class Student {
	
	private String name;
	private int age;
	private double GPA;
	
	static Student obj1=null;
	static Student obj2=null;
	
	
	
	Student(String name,int age,double GPA){
		this.name=name;
		this.age=age;
		this.GPA=GPA;
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}

	void displayGPA() {
		System.out.println(obj1.GPA);
	}
	
	public static void main(String[] args) {
		obj1=new Student(" ",25,5.6);
		obj2=new Student(".",29);
		obj1.displayGPA();
	}

}
