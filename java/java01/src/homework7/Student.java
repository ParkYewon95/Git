package homework7;

public class Student extends Person{
	
//	String name;
//	int age;
	private int id;

	
	public Student(String name, int age, int id) {
	super(name, age);
	setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.printf("이  름 : %-6s 나 이 : %-5d 학     번 : %s %n",super.getName(),super.getAge(),this.id);
	}
}
