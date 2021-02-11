
public class BankAccount {
	
	int balance;
	
	// �Ķ���� : �Ա��� �׼�(����)
	// ���� : ��������(�Ҹ�)
	
	Person owner = new Person();
	
	boolean deposit(int amount) {
		
		if (amount < 0 || owner.cashAmount < amount) {
			System.out.printf("�Ա� �����Դϴ�. �ܰ�: %d��, ����: %d��\r\n", balance, owner.cashAmount);
			return false;
		}
		
		balance = balance + amount ;
		owner.cashAmount = owner.cashAmount - amount;
		System.out.printf("%d�� �Ա��Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\r\n", amount, balance, owner.cashAmount);
		return true;
		
	}
	
	// �Ķ���� : ����� �׼� (����)
	// ���� : �������� (�Ҹ�)
	boolean withdraw(int amount) {
		
		if (amount < 0 || balance < amount)  {
			System.out.printf("��� �����Դϴ�. �ܰ�: %d��, ����: %d��\r\n", balance, owner.cashAmount);
			return false;
		}
		
		balance -= amount;
		owner.cashAmount += amount;
		System.out.printf("%d�� �Ա��Ͽ����ϴ�. �ܰ�: %d��, ����: %d��\r\n", amount, balance, owner.cashAmount);
		return true;
		
	}
	
	// ù ��° �Ķ���� : �޴� ��� (Person)
	// �� ��° �Ķ���� : ��ü�� �ݾ� (����)
	// ���� : �������� (�Ҹ�)
	/*
	boolean transfer(Person to, int amount) {
		
	}*/
	

}
