package day08;

public class Test05 {

	public static void main(String[] args) {
		Account a1 = new Account("kim","001",3000);
		Account a2 = new Account("Lee","002",3500);
		
		System.out.println(a1);
		System.out.println(a2);
		
	}
	
	
}


class Account extends Object {
	
	String name;
	String number;
	int money;
	
	//기본생성자
	public Account() {
		super();
	}
	//생성자
	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
}