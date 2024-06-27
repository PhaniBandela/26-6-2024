package assignment2;

public class Year {

	public static void main(String[] args) {
		int year=2024;
		String result=((year%400==0)||(year%4==0)&&(year%100!=0))?"leap year":"not a leap year";
		System.out.println(result);
//		int a=232,b=444,c=52,d=3000;
//		c=(a>b&a>c&a>d)?a:((b>c&b>d)?b:(c>d?c:d));
//		System.out.println(c);
    }
}
