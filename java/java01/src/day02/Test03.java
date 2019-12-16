package day02;

public class Test03 {
	public static void main(String[] args) {
		int pw = 0;
		System.out.println(pw);
		
		pw = " hello1234 ".trim().length();
		System.out.println(pw);
		
		String msg = null;
		
		msg = "hello java ~~";
		int index= msg.codePointAt(0);
		System.out.println((char)index);
		
	
	}
}
