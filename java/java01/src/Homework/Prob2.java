package Homework;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		StringBuilder sb = new StringBuilder();
		String b = "bb";	
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		for(int i=0; i<sourceString.length();i++) {
						
			char a= sourceString.charAt(i);
			
//			if (a>='a'&&a<'x') {
//				a = (char)(a+3);
//				encodedString += a;
//			}else if('x'<=a && a<='z') {
//				a = (char)(a-23);
//				encodedString += a;		
//			}else
//				encodedString += a;
			
			a = a>='a'&& a<='w'?(char)(a+3): a>='x'&&a<='z'?(char)(a-23):a;
			
			sb.append(b);
		}
		
		encodedString = sb.toString();

		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}
}
