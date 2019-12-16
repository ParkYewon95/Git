package day09;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("Start");
		
		//1000ms = 1초
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--------------------------");
		
		//예외객체 생성해서 던져본다. (예외발생을 임의적으로 만듦)
		try {
			throw new Exception("예외실습");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}
}
