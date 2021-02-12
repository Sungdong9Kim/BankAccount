
public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if (age >=0 ) {
			this.age = age;
		}		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setCashAmount(int cashAmount) {
		if (cashAmount >= 0) {
			this.cashAmount = cashAmount;			
		}
		
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	

}
