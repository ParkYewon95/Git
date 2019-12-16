package day09;

public class Test09 {
	
	public static void main(String[] args) {

		Account account = new Account("홍길동","001",1000);
		try {
			account.output(7000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		Account account2 = new Account("김길동","002",3000);
//		try {
//			account2.output(7000);
//		} catch (MoneyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	}
}

//직접 exception을 상속받아 예외처리 클래스 만들기
class MoneyException extends Exception{
	MoneyException(){
		super("계좌잔고 예외발생");
	}
	MoneyException(String msg){
		super(msg);
	}
}

class Account extends Object{
	String name;
	String number;
	int money;
	
	
	
	
	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	public void input(int money) {
		this.money = money;
	}
	
	public void output(int money) throws MoneyException{
		
		if(this.money < money) throw new MoneyException();
		this.money -= money;	
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}
	
	
}