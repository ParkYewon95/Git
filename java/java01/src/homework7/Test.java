package homework7;

public class Test {

	public static void main(String[] args) {
		
		Person[] person = { new Employee("유관순",40,"교무과"),
				new Student("홍길동",20,200201), 
				new Teacher("이순신",30,"JAVA")};
		
		
		for( Person data:person) {
			//print 함수는 자식클래스에서 각각 선언된 함수이므로
			// 반드시 다운캐스팅이 필요하다. 
			if(data instanceof Employee) 
				((Employee)data).print();
			if(data instanceof Student) 
				((Student)data).print();
			if(data instanceof Teacher) 
				((Teacher)data).print();

			
		}
	}

}
