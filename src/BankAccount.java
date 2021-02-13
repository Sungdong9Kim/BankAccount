
public class BankAccount {
	
	private int balance;
	
	// �Ķ���� : �Ա��� �׼�(����)
	// ���� : ��������(�Ҹ�)
	
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
			System.out.printf("�Ա� �����Դϴ�. �ܰ�: %d��, ����: %d��\r\n", balance, owner.getCashAmount());
			return false;
		}
		
		balance = balance + amount ;
		owner.setCashAmount(owner.getCashAmount() - amount);
		System.out.printf("%d�� �Ա��Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\r\n", amount, balance, owner.getCashAmount());
		return true;
		
	}
	
	boolean deposit(double amount, double exchangeRate) {
		return deposit((int) (amount * exchangeRate));
	}
	
	// �Ķ���� : ����� �׼� (����)
	// ���� : �������� (�Ҹ�)
	boolean withdraw(int amount) {
		
		if (amount < 0 || balance < amount)  {
			System.out.printf("��� �����Դϴ�. �ܰ�: %d��, ����: %d��\r\n", balance, owner.getCashAmount());
			return false;
		}
		
		balance -= amount;
		owner.setCashAmount(owner.getCashAmount()+amount);
		System.out.printf("%d�� ����Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\r\n", amount, balance, owner.getCashAmount());
		return true;
		
	}
	/*Function that I made for transfer
	
	public boolean transfer(Person to, int amount) {
		if((amount < 0) || (getBalance() < amount)) {
			System.out.printf("false - from: "+getPerson().getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+balance+"\n");
			return false;
		}
		else {
			setBalance(getBalance()- amount);
			to.getAccount().setBalance(to.getAccount().getBalance() + amount);
			
			System.out.printf("true - from: "+getPerson().getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+balance+"\n");
			return true;
		}
		
	}
	
	public boolean transfer(BankAccount to, int amount) {
		if((amount < 0)|| (getBalance() < amount)) {
			System.out.printf("false - from: "+getPerson().getName()+", to: "+to.getPerson().getName()+", amount: "+amount+", balance: "+balance+"\n");
			return false;
		}
		else {
			setBalance(getBalance() - amount);
			to.setBalance(to.getBalance() + amount);
			System.out.printf("true - from: "+getPerson().getName()+", to: "+to.getPerson().getName()+", amount: "+amount+", balance: "+balance+"\n");
			return true;
		}
		
	}*/
	
	//Correct function for transfer
	
	public boolean transfer(BankAccount to, int amount) {
		boolean success;
		
		if(amount < 0 || amount > balance) {
			success = false;
		}
		else {
			success = true;
			balance -= amount;
			to.balance += amount;
		}
		
		System.out.println(success + " - from: " + owner.getName()
        + ", to: " + to.owner.getName()
        + ", amount: " + amount
        + ", balance: " + balance);
		
		return success;
	}
	
	public boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(), amount);
	}
	

}
