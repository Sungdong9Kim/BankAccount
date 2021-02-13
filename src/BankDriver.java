

public class BankDriver {
	public static void main(String[] args) {
		// 사람 선언
		Person p1 =new Person();
		p1.setName("김신의");
		p1.setAge(28);
		p1.setCashAmount(30000);
		
		// 테스트
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAccount());
		
		// 은행 계좌 생성
		BankAccount a1 = new BankAccount();
		a1.setBalance(100000);
		
		p1.setAccount(a1);
		a1.setOwner(p1);
		
		Person p2 = new Person();
		p2.setName("김성동");
		p2.setAge(34);
		p2.setCashAmount(100000);
		
		BankAccount a2 = new BankAccount();
		
		
		a2.setBalance(500000);
		p2.setAccount(a2);
		a2.setOwner(p2);
		System.out.println(p2.getCashAmount());
		System.out.println(p2.getAccount());
		
		a2.deposit(30000);
		a2.withdraw(170000);
		a2.deposit(620000);
		a2.withdraw(890000);		
		
		// 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
				
	}
}
