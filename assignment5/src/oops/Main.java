package oops;

//Example usage
	public class Main {
	    public static void main(String[] args) {
	        Mammal lion = new Mammal("Lion", "Savannah", true);
	        Bird eagle = new Bird("Eagle", "Mountains", true);
	        Reptile snake = new Reptile("Snake", "Desert", true);

	        System.out.println(lion);
	        System.out.println(lion.makeSound());
	        System.out.println(lion.giveBirth());

	        System.out.println(eagle);
	        System.out.println(eagle.makeSound());
	        System.out.println(eagle.move());

	        System.out.println(snake);
	        System.out.println(snake.makeSound());
	        System.out.println(snake.layEggs());
	    }
	}
