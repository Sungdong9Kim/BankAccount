

public class BankDriver {
	public static void main(String[] args) {
		// ��� ����
		Person p1 =new Person();
		p1.name = "�����";
		p1.age = 28;
		p1.cashAmount = 30000;
		
		// �׽�Ʈ
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.account);
		
		// ���� ���� ����
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		p1.account = a1;
		a1.owner = p1;
		
		Person p2 = new Person();
		p2.name = "�輺��";
		p2.age = 34;
		p2.cashAmount = 100000;
		
		BankAccount a2 = new BankAccount();
		
		
		a2.balance = 500000;
		p2.account = a2;
		a2.owner = p2;
		System.out.println(p2.cashAmount);
		System.out.println(p2.account);
		
		a2.deposit(30000);
		a2.withdraw(170000);
		a2.deposit(620000);
		a2.withdraw(890000);		
				
	}
}
