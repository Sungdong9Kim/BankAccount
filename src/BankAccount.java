
public class BankAccount {
	
	private int balance;
	
	// 파라미터 : 입금할 액수(정수)
	// 리턴 : 성공여부(불린)
	
	private Person owner;
	
	void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public Person getPerson() {
		return owner;
	}
	
	boolean deposit(int amount) {
		
		if (amount < 0 || owner.getCashAmount() < amount) {
			System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\r\n", balance, owner.getCashAmount());
			return false;
		}
		
		balance = balance + amount ;
		owner.setCashAmount(owner.getCashAmount() - amount);
		System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\r\n", amount, balance, owner.getCashAmount());
		return true;
		
	}
	
	boolean deposit(double amount, double exchangeRate) {
		return deposit((int) (amount * exchangeRate));
	}
	
	// 파라미터 : 출금할 액수 (정수)
	// 리턴 : 성공여부 (불린)
	boolean withdraw(int amount) {
		
		if (amount < 0 || balance < amount)  {
			System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\r\n", balance, owner.getCashAmount());
			return false;
		}
		
		balance -= amount;
		owner.setCashAmount(owner.getCashAmount()+amount);
		System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\r\n", amount, balance, owner.getCashAmount());
		return true;
		
	}
	
	// 첫 번째 파라미터 : 받는 사람 (Person)
	// 두 번째 파라미터 : 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	/*
	boolean transfer(Person to, int amount) {
		
	}*/
	

}
