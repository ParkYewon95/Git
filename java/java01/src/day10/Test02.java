package day10;

public class Test02 {

	public static void main(String[] args) {
//		Employee2<String,String> emp1 = new Employee2("홍길동","001");
//		System.out.println(emp1);
//		
		Employee2<String,Double> emp3 = new Employee2("홍길동", 2019001.0);
		System.out.println(emp3);
	}

}

class Employee2<T,P extends Number> { //p는 number의 자식만 가능해!
	
	T name;
	P number;
	
	public Employee2(T name, P number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}
	
}