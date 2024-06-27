package assignment3;

public class YoungestAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1=12,age2=12,age3=12;
		if(age1<age2 && age1<age3)
			System.out.println(age1);
		else if(age2<age3)
			System.out.println(age2);
		else
			System.out.println(age3);
//		if(age1<0||age2<0||age3<0)
//			System.out.println("enter correct age");
//		else {
//		int result=(age1<age2&& age2<age3)?age1:((age2<age3?age2:age3));
//		System.out.println(result);}
	}

}
