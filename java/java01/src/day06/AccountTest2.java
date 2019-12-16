package day06;

public class AccountTest2 {

	public static void main(String[] args) {
		//Account[] a = new Account[10];
		
		Account a1 = new Account("2019-12-09-001","박예원",10);
		a1.print();
		
		Account a2 = new Account("2019-12-09-002","김길동",7000);
		a2.print();
		
		Account a3 = new Account();
		a3.print();
		
	}

}
