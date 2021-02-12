
public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	
	int getCashAmount() {
		return cashAmount;
	}
	
	void setAccount(BankAccount account) {
		this.account = account;
	}
	
	BankAccount getAccount() {
		return account;
	}
	

}
