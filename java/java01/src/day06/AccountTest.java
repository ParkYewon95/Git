package day06;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.setNumber("2019-12-09-001");
		a1.setName("박예원");
		a1.setMoney(10);
		a1.print();
		
		
		Account a2 = new Account();
		a2.setNumber("2019-12-09-002");
		a2.setName("김길동");
		a2.setMoney(70000);
		a2.print();
		
		Account.transfer(a2, a1, 2000);
		a1.print();
		a2.print();
		
	}

}
