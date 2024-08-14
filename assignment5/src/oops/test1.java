package oops;

public class test1 {

	public static void main(String[] args) {
		animals a=new animals();
		a.sounds();
		System.out.println();
		cat c=new cat();
		c.sounds();
		c.catsounds();
		System.out.println();
		dog d=new dog();
		d.sounds();
		d.dogsounds();
		
	}

}
class animals{
	void sounds() {
		System.out.println("animals make sounds");
	}
}
class cat extends animals{
	void catsounds() {
		System.out.println("cat makes meow meeow");
	};
}

class dog extends animals{
	void dogsounds() {
		System.out.println("dog makes bow bow");
	}
}
