package homework7;

public class Teacher extends Person{
//	String name;
//	int age;
	private String subject;

	
	public Teacher(String name, int age, String subject) {
	//super(name, age);
	super(name, age);
	setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.printf("이  름 : %-6s 나 이 : %-5d 담당과목 : %s %n",super.getName(),super.getAge(),this.subject);

	}
}
