package assignment4;

import java.util.Scanner;

public class Scanuptoneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter values:");
		int a=scan.nextInt();
		int b=0;
		while(a>0) {
			b+=a;
			a=scan.nextInt();
		}
		System.out.println("sum upto negno appers: "+b);
	}

}
