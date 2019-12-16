package day08;

public class Test03 {

	public static void main(String[] args) {

	}

}


class Point{
	int x;
	int y;
}

//has a 관계(원은 점이다 = is a관계 /원은 점을 가지고 있다=has a관계)
class Circle2 extends Point{	
//	int x;
//	int y;
	Point p;
	int r;
}