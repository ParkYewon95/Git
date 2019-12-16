package day02;

public class Test05 {
	public static void main(String[] args) {
/*
		byte num = 127; 
		
		num = (byte)(num+1); // 정수 연산 후 바이트 전환 -> 오버플로우 발생 . -128 가장 작은 값 출력.
		
		System.out.println(num);
		
		char c = 'a';
		System.out.printf(" %b %n",Character.isDigit(c));
		
//		System.out.println("abc"+"def"); //abcdef
//		System.out.println(1+1+1); //3
//		System.out.println(1+1+"1"); //21
//		System.out.println("1"+1+1);//111
	*/	
		String r1="100";
		int i=Integer.parseInt(r1)+1;
		
		System.out.println(i);
		
		double r3 = Double.parseDouble("105.5");
		int r4 = (int) (Double.parseDouble("105.5")+1);
		System.out.println(r4);
		
		
		System.out.println(Math.PI);
		
		
		
	}
}
