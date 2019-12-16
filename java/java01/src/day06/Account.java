package day06;

public class Account {

	private String name;
	private String number;
	private int money ; 
	
	public Account() {
		this("","",0);	// 나와 같은(파라미터) 형태의 생성자를 호출하는 문장.
		System.out.println("Account 기본생성자 호출");
		
	}
	
	public Account(String number,String name, int money) {
		setNumber(number);
		setName(name);
		setMoney(money);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * @param money 입금금액
	 */
	
	public void input(int money){
		this.money += money;
	}
	
	/**
	 * 
	 * @param money 출금금액
	 * @return 출금액
	 */
	public int output(int money){
		
		if(this.money>=money) {
			this.money -= money;		
			return money;
		}else {
			return 0;
		}
	}
	
	/**
	 * 계좌정보 출력
	 */
	public void print(){
		System.out.printf("이름 : %s, 계좌번호 : %s, 잔고 : %d(원) %n",name,number,money);
	}
	
	/**
	 * 
	 * @param from 	출금계좌
	 * @param to	입금계좌
	 * @param money	계좌이체금액
	 */
	public static void transfer(Account from, Account to, int money) {
		System.out.println("계좌이체");
		System.out.println(from.number+" --> "+to.number);
		to.input(from.output(money));
	}
	
}
