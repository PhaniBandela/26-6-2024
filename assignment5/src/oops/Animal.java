package oops;



	// Base class for all animals
	public class Animal {
	    protected String name;
	    protected String habitat;

	    public Animal(String name, String habitat) {
	        this.name = name;
	        this.habitat = habitat;
	    }

	    public String makeSound() {
	        return "Some generic animal sound";
	    }

	    public String move() {
	        return "The animal moves";
	    }

	    @Override
	    public String toString() {
	        return name + " lives in " + habitat;
	    }
	}

	// Derived class for mammals
	class Mammal extends Animal {
	    private boolean hasFur;

	    public Mammal(String name, String habitat, boolean hasFur) {
	        super(name, habitat);
	        this.hasFur = hasFur;
	    }

	    public String giveBirth() {
	        return "Gives live birth";
	    }

	    @Override
	    public String makeSound() {
	        return "Some generic mammal sound";
	    }

	    @Override
	    public String toString() {
	        String furInfo = hasFur ? "has fur" : "doesn't have fur";
	        return super.toString() + " and " + furInfo;
	    }
	}

	// Derived class for birds
	class Bird extends Animal {
	    private boolean canFly;

	    public Bird(String name, String habitat, boolean canFly) {
	        super(name, habitat);
	        this.canFly = canFly;
	    }

	    public String layEggs() {
	        return "Lays eggs";
	    }

	    @Override
	    public String makeSound() {
	        return "Some generic bird sound";
	    }

	    @Override
	    public String move() {
	        return canFly ? "The bird flies" : "The bird walks";
	    }

	    @Override
	    public String toString() {
	        String flyInfo = canFly ? "can fly" : "can't fly";
	        return super.toString() + " and " + flyInfo;
	    }
	}

	// Derived class for reptiles
	 class Reptile extends Animal {
	    private boolean hasScales;

	    public Reptile(String name, String habitat, boolean hasScales) {
	        super(name, habitat);
	        this.hasScales = hasScales;
	    }

	    public String layEggs() {
	        return "Lays eggs";
	    }

	    @Override
	    public String makeSound() {
	        return "Some generic reptile sound";
	    }

	    @Override
	    public String toString() {
	        String scaleInfo = hasScales ? "has scales" : "doesn't have scales";
	        return super.toString() + " and " + scaleInfo;
	    }
	}

