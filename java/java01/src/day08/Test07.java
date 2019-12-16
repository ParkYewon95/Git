package day08;

public class Test07 {
	public static void main(String[] args) {
		Circle1 c = new Circle1();
		System.out.println(c.cArea(5));
		c.print();
		c.color = "나는 노란색을 조아해";
		System.out.println(c.color);
		
		Circle3 c2 = new Circle3();
		System.out.println(c2.cArea(5));
		//c2.color = "노랑"; // final 선언된 변수라 에러처리남.
		System.out.println(c2.color);
		
	}
}

// 고려사항 파라미터, 리턴타입
class Circle1 extends shape_a{
	//원의 면적
	@Override
	public double cArea(double r) {	
		return Math.PI*r*r;
	}
}

//base 코드
abstract class shape_a{
	String color; // instance 자원
	public abstract double cArea(double r);
	public void print() { // 멤버 함수.
	}
}

interface shape_i{
	final String color = "red" ; 
	/*public abstract*/ double cArea(double r);
	
}

class Circle3 implements shape_i{

	// abstract와 마찬가지로 method를 오버라이딩 해야한다. 
	@Override
	public double cArea(double r) {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
}



