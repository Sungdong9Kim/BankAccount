
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
	
	// ù ��° �Ķ���� : �޴� ��� (Person)
	// �� ��° �Ķ���� : ��ü�� �ݾ� (����)
	// ���� : �������� (�Ҹ�)
	/*
	boolean transfer(Person to, int amount) {
		
	}*/
	

}
