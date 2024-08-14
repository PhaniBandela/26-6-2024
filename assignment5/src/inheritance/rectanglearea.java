package inheritance;

public class rectanglearea {

	public static void main(String[] args) {
		area obj=new area();
		int a=obj.a();
		System.out.println(a);
	}

}
class rectangle{
	int length;
	int breath;
	rectangle(){
		length=10;
		breath=20;
	}
}

class area extends rectangle{
	int area;
	public int a() {
		area=length*breath;
		return area;
	}
}








