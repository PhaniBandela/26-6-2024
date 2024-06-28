package assignment4;

public class ProfitorLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sellingprice=100,costprice=100;
		if(sellingprice>costprice)
			System.out.println("profit");
		else if(costprice>sellingprice)
			System.out.println("loss");
		else if(costprice==sellingprice)
			System.out.println("no gain no loss");

	}

}
