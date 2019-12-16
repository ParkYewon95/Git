package Homework;

public class Prob5 {
	public static void main(String args[]) {
		
		
		System.out.println( Prob5.leftPad("SDS", 6, '#') );
		System.out.println( Prob5.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob5.leftPad("SDS", 2, '&') ); 
		
		Prob5 p5 = new Prob5();
		//System.out.println(p5.rightPad(str, size, padChar));
	}
	
	
	public static String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
			
		StringBuilder sb= new StringBuilder();
		int cnt = size-str.length();
		
		for(int i=0; i<cnt; i++) {
			sb.append(padChar);
		}
		sb.append(str);
		
		return sb.toString();		
		
	}
	
	
	public String rightPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
			
		StringBuilder sb= new StringBuilder();
		
		sb.append(str);
		
		for(int i=0; i<size-str.length(); i++) {
			sb.append(padChar);
		}
		
		return sb.toString();		
	}
}  