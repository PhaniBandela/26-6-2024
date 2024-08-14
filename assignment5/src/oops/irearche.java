package oops;

public class irearche {

	public static void main(String[] args) {
		
		Animals animal=new Animals();
		animal.can();
		
		reptails snake=new reptails("snake");
		mammels cow=new mammels("cow");
		Birds duck=new Birds("duck");
		
		snake.can();
		cow.can();
		duck.can();

	}

}

class Animals{
	void can() {
		System.out.println("every animal can move");
	}
	
}

class Birds extends Animals{
	String name;
	Birds(String name){
		this.name=name;
	}
	void can() {
		System.out.println(name+" can fly");
	}
}


class mammels extends Animals{
	String name;
	mammels(String name){
		this.name=name;
	}
	void can() {
		System.out.println(name+" can walk");
	}
}

class reptails extends Animals{
	String name;
	reptails(String name){
		this.name=name;
	}
	void can() {
		System.out.println(name+" can slide");
	}
}