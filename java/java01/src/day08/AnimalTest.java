package day08;

public class AnimalTest {

	public static void main(String[] args) {
		Animal [] animals = {
				new Dog("진돗개","캐리"),
				new Fish("쿠쿠")
		};
		
		for(Animal data:animals) {
			data.breath();
			if (data instanceof Dog) {
				((Dog) data).print();
			}
			if (data instanceof Fish) {
				((Fish) data).print();
			}
				
		}
	}
}
