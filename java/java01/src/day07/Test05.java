package day07;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog[] d;
		Fish[] f;
		
		
		Animals[] animals //dog , fish 둘 다 들어갈 수 있음.
		 = {
			new Dog("진돗개","토토"),
			new Fish("쿠피"),
			new Fish("재피"),
			new Dog("시베리안 허스키","해피")		
		};
				
		//타입 data : 배열
		for(Animals data:animals) {
			//print 함수는 자식클래스에서 각각 선언된 함수이므로
			// 반드시 다운캐스팅이 필요하다. 
			if(data instanceof Dog) 
				((Dog)data).print();
			if(data instanceof Fish) 
				((Fish)data).print();	
			
			// breath는 부모 클래스에서 선언된 함수로 각각 맞게 오버라이딩 된다.
			data.breath();
		}
	}

}
