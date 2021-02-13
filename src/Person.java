
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
	
	/*Function that I made for transfer
	
	public boolean transfer(Person to, int amount) {
		if((amount < 0) || (account.getBalance() < amount)) {
			System.out.printf("false - from: "+getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+account.getBalance()+"\n");
			return false;
		}
		else {
			account.setBalance(account.getBalance()- amount);
			to.getAccount().setBalance(to.getCashAmount() + amount);
			
			System.out.printf("true - from: "+getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+account.getBalance()+"\n");
			return true;
		}
		
	}
	
	public boolean transfer(BankAccount to, int amount) {
		if((amount < 0)|| (account.getBalance() < amount)) {
			System.out.printf("false - from: "+getName()+", to: "+to.getPerson().getName()+", amount: "+amount+", balance: "+account.getBalance()+"\n");
			return false;
		}
		else {
			account.setBalance(account.getBalance() - amount);
			to.setBalance(to.getBalance() + amount);
			System.out.printf("true - from: "+getName()+", to: "+to.getPerson().getName()+", amount: "+amount+", balance: "+account.getBalance()+"\n");
			return true;
		}
		
	}*/
	
	public boolean transfer(Person to, int amount) {
		return account.transfer(to.getAccount(), amount);
	}
	
	public boolean transfer(BankAccount to, int amount) {
		return account.transfer(to, amount);
	}
	

}
