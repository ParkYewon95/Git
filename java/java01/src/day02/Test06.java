package day02;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num = 99;
		System.out.printf("%c => %d %n",'0',(int)'0');
		System.out.printf("%c => %d %n",'A',(int)'A');
		System.out.printf("%c => %d %n",'a',(int)'a');
		System.out.printf("%c => %d %n",'z',(int)'z');
		System.out.printf("%d => %c %n",91,(char)91);
		
		// 소문자 -> 대문자 = -32 
		//대문자는65~90 까지
		// 소문자는 97부터 122?
		char c = 'a';
		boolean flag = c>='a' && c<='z';
		System.out.println("소문자?"+flag);
		System.out.println('a'-'A');
		
		*/
		
		int score=100;
		String result = score>70 ? "pass":"fail";
		System.out.println(score+" : "+result);
		
		char ch = '[';
		char r = ( ch>='a' && ch <='z') ? (char)(ch-32):((ch>='A'&&ch<='Z')?ch:'0');
		
		System.out.println(r);
		

		
		
		
	}

}
