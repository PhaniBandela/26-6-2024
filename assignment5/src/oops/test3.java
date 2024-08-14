package oops;


class bank{
	private String accountno;
	private String name;
	private float amount;
//	bank(String accountno,String name,float amount){
//		this.name=name;
//		this.accountno=accountno;
//		this.amount=amount;
//	}
	public float getamount() {
		return amount;
	}
	
	public String getname() {
		return name;
	}
	
	public String getaccountno() {
		return accountno;
	}
	public void setamount(int amount) {
		this.amount=amount;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setaccountno(String accountno) {
		this.accountno=accountno;
	}
}
public class test3 {

	public static void main(String[] args) {
		bank obj=new bank();
		obj.setname("abcd");
		obj.setaccountno("12345678as");
		obj.setamount(124);
		System.out.println(obj.getname());
		System.out.println(obj.getaccountno());
		System.out.println(obj.getamount());
		

	}

}
