

public class BankDriver {
	public static void main(String[] args) {
		// ��� ����
		Person p1 =new Person();
		p1.setName("�����");
		p1.setAge(28);
		p1.setCashAmount(30000);
		
		// �׽�Ʈ
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAccount());
		
		// ���� ���� ����
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		p1.setAccount(a1);
		a1.owner = p1;
		
		Person p2 = new Person();
		p2.setName("�輺��");
		p2.setAge(34);
		p2.setCashAmount(100000);
		
		BankAccount a2 = new BankAccount();
		
		
		a2.balance = 500000;
		p2.setAccount(a2);
		a2.owner = p2;
		System.out.println(p2.getCashAmount());
		System.out.println(p2.getAccount());
		
		a2.deposit(30000);
		a2.withdraw(170000);
		a2.deposit(620000);
		a2.withdraw(890000);		
				
	}
}
