package assignment3;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=888,m=0;
		if(a>=500) {
			m=a/500;
			System.out.println("500 notes "+m);}
			a=a%500;
		if(a>=200) {
			m=a/200;
		    System.out.println("200 notes "+m);}
 		    a=a%200;
	    if(a>=100) {
	    	m=a/100;
	        System.out.println("100 notes "+m);}
	    a=a%100;
	    if(a>=50) {
		    m=a/50;
		    System.out.println("50 notes "+m);}
	    a=a%50;
		if(a>=20) {
		    m=a/20;
		    System.out.println("20 notes "+m);}
		a=a%20;
		if(a>=10) {
	    	m=a/10;
	        System.out.println("10 notes "+m);}
		a=a%10;
	    if(a>=5) {
		    m=a/5;
		    System.out.println("5 notes "+m);}
	    a=a%5;
		if(a>=2) {
		    m=a/2;
		    System.out.println("2 notes "+m);}
		a=a%2;
	    if(a>=1) {
	    	m=a/1;
	    	System.out.println("1 notes "+m);}
	    a=a%1;
	}
}
