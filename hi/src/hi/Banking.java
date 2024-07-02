package hi;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountNumber;
		String accountHolderName;
		double balance=10000;
		int amount;
		String data;
		
		
		//enter details
		data="";
		accountNumber="";
		accountHolderName="";
		amount=1000;
		
		
		
		
		if(accountNumber=="" || accountHolderName=="") 
		{
			System.out.println("enter details like-'account number' and 'account holder name'");
		}
		else {
			switch(data) {
			case "enquire":
					System.out.println("account number"+accountNumber);
					System.out.println("Account Holder Name "+accountHolderName);
					System.out.println("Balance:$"+balance);
				
				break;
			case "deposit":
				balance+=amount;
				System.out.println("account number"+accountNumber);
				System.out.println("Account Holder Name "+accountHolderName);
				System.out.println("Deposite: "+amount);
				System.out.println("Balance: $"+balance);
				break;
			case "withdraw":
				if(balance>=amount) {
					balance-=amount;
					System.out.println("account number"+accountNumber);
					System.out.println("Account Holder Name "+accountHolderName);
					System.out.println("withdraw: "+amount);
					System.out.println("Balance: "+balance);
				}
				else {
					System.out.println("account number"+accountNumber);
					System.out.println("Account Holder Name "+accountHolderName);
					System.out.println("insufficent funds");
					}
				break;
				default:
					System.out.println("how can i help you--'withdraw' or 'deposit' or'enquire'");
			
			}}
	}
}
