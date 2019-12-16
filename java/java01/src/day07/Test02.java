package day07;

public class Test02 {
	public static void main(String[] args) {
		//is a 관계
		//모든 객체의 데이터 타입은 부모가 될 수 있다.
		
		//Object타입
		Object a = new Animals();
		
		//down casting
		((Animals)a).breath();
		
		
		//Animals 타입
		Animals a2 = new Animals();
		a2.breath();
		
		//부모 타입으로 전환에 문제 없음. 
		Object obj = a2;
		
		// 자식 = 부모 캐스티은 불가함. 
		//Animals temp = obj;
		Animals temps = (Animals)obj;
		
		temps.breath();
		
		Dog d = new Dog();
		System.out.println(d.kind); // 제일 하단부에 존재하는 kind
		
		Object obj2 = d;
		Animals a3 = (Animals)obj2; // 자동 형변환 불가 
		System.out.println(a3.kind);
		
		Dog d3 = (Dog)obj2;
		System.out.println(d3.kind);
		
		String msg = "hello java";
		
		System.out.println("============================");
		/** object를 Dog 객체로 캐스팅하는데에는 에러가 잡히지 않지만 
		 *  실제로 실행하면 obj7에 kind 변수가 없어서 에러가 발생한다.
		**/
		Object obj7 = d; //object d
		
		if(obj7 instanceof Dog)
			System.out.println(((Dog)obj7).kind);
		
		if(obj7 instanceof Animals)
			System.out.println(((Animals)obj7).kind);	
		
		if(obj7 instanceof String)
			System.out.println(((String)obj7).toUpperCase());
		
	}
}
