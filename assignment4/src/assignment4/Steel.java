package assignment4;

public class Steel {

	public static void main(String[] args) {
		int hardness=51,tensiteStrength=5600;
		double carboncontent=0.7;
		if(hardness>50 && carboncontent<0.7 && tensiteStrength>5600)
			System.out.println("grade 10");
		else if(hardness>50 && carboncontent<0.7)
			System.out.println("grade 9");
		else if(carboncontent<0.7 && tensiteStrength>5600)
			System.out.println("grade 8");
		else if(hardness>50 && tensiteStrength>5600)
			System.out.println("grade 7");
		else if(hardness>50 || carboncontent<0.7 || tensiteStrength>5600)
			System.out.println("grade 6");
		else
			System.out.println("grade 5");
		
	}

}
