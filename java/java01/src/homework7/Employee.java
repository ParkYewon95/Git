package homework7;

public class Employee extends Person {
//	String name;
//	int age;
	private String dept;
	
	
	public Employee(String name, int age, String dept) {
	super(name, age);
	setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.printf("이  름 : %-6s 나 이 : %-5d 부     서 : %s %n",super.getName(),super.getAge(),this.dept);
	}
}
