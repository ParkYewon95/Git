package day08;

public class Test08 {
	public static void main(String[] args) {

		// 방법 2
		T[] s = {new Circle(), new Rectangle()};
		
		for(T data:s) {
			data.draw();
			data.move();
		}
		
	}
}

interface Drawable{
	void draw(); 	
}

interface Moveable{
	void move();
}

interface T extends Drawable, Moveable{
	
}

class Circle implements T{
	
	String name = "Circle";
	
	@Override
	public void move() {
		System.out.println(name + " 이동하기");
	}

	@Override
	public void draw() {
		System.out.println(name + " 그리기");
	}
	
}

class Rectangle implements T{
	String name = "Rectangle";

	@Override
	public void move() {
		System.out.println(name + " 이동하기");
	}

	@Override
	public void draw() {
		System.out.println(name + " 그리기");
	}
}
