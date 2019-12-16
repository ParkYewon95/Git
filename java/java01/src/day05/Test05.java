package day05;

public class Test05 {
	public static void main(String[] args) {
		
		Employee emp1;	
		emp1 = new Employee();
		
		Employee emp2 = new Employee();
		
		emp1.name = "yewon";
		emp1.age = 23;
		emp1.dept = "programming";
		
		emp2.name = "고길동";
		emp2.dept ="교육부";
		emp2.age = 22;
		
		Employee emp3 = emp1;
		
		emp1.print();
		emp2.print();
		emp3.print();
		
		emp3.name = "박예원";
		emp1.print();		
		
		Employee[] employees = new Employee[3];
		
		
		
	}
}


class Employee{
	
	//member 변수
	String name ;
	String dept;
	int age;
		
	//기능
	public void print() {
		System.out.printf("[%s,%s,%d]%n",this.name,this.dept,this.age);	
		return;
	}
	
}