package day10;

public class Test01 {

	public static void main(String[] args) {
		Employee<String> emp1 = new Employee("홍길동","2019001");
		System.out.println(emp1);
		
		Employee<Integer> emp2 = new Employee("고길동",2019002);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("김길동", 2019003);
		System.out.println(emp3);
		
		System.out.println(emp1.number);
		System.out.println(emp2.number);
		System.out.println(emp3.number);
	}

}

class Employee <T>{ //컴파일할때 알려줄 타입 < > - 이게 제너릭이다. 
	String name;
	T number; //타입을 나중에 알려줄게!
	
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
}