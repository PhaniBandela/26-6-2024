package Constructors;
/*2.Write a Java class called Employee that extends Person and adds a private field for
salary. Create a constructor that takes in a name, age, and salary as parameters and
initializes the fields using the super keyword to call the Person constructor. Also,
create a method called displaySalary that prints out the employee's salary.*/

public class quetion2 {
	int age;
	String name;
	private double salary;
	static quetion2 obj=null;
	quetion2(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public static void displaySalary() {
		System.out.println(obj.salary+" "+obj.age+" "+obj.name);
	}
	public static void main(String[] args) {
		obj=new quetion2("A",25,25000);
		displaySalary();
	}

}
