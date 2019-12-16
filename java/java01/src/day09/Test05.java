package day09;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("Start");
		
		String msg = "0";
		int num;
		int res=0;
		
		try {
			num = Integer.parseInt(msg);
			res = 1000/num;
			int[] number = new int[num];
			
		}catch(NumberFormatException e) {
			System.out.println("문제발생 "+e);
			System.out.println("숫자로 입력해주세요");
		}
		catch(ArithmeticException e) {
			System.out.println("0을 제외한 숫자를 입력하세요.");
		}
		catch(Exception e) { // 에러의 최상위 - 모든 에러를 잡는다.
			System.out.println(e);
		}
		finally {
			System.out.println("자원반납");
		}
		
		
		
		
//		System.out.println(num);
//		System.out.println(res);
		System.out.println("end");
	}
}


