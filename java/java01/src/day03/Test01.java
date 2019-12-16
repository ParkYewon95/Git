package day03;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ==와 equals() method 비교
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.printf("s1= %s, s2= %s %n", s1,s2);
		System.out.printf("s1==s2 %b %n", s1==s2);
		System.out.printf("s1 equals s2 %b %n", s1.equals(s2));
		
		
		String s3 = "java";
		String s4 = "java";
//
		System.out.printf("s3 == s4 %b %n", s3==s4);
		System.out.printf("s3 equals s4 %b", s3.equals(s4));
	
	}

}
