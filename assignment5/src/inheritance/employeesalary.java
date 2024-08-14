package inheritance;

public class employeesalary {

	public static void main(String[] args) {
		salary obj=new salary();
		obj.show();

	}

}

class employee{
	int empid;
	String name;
	employee(){
		empid=100;
		name="ABCD";
	}
	
}

class salary extends employee{
	int salary;
	void show() {
		salary=1234567;
		System.out.println("Employee name: "+name);
		System.out.println("salary: "+salary);
		
	}
}
