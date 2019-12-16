package day05;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1,2,3};
		
		// 받을 데이터 : 꺼낼 데이터 배열
		for(int data:num) {
			System.out.print(data);
			
		}
		System.out.println();
		
		char[] c = "ABCD".toCharArray();
		
		for(char data:c) {
			System.out.print(data+"  ");
			
		}
		System.out.println();
		
		String[] s = {"hello","java","test"};

		for(String data:s) {
			if(data.charAt(0)=='t')
				System.out.println(data);	
		}
		
		
	}

}
