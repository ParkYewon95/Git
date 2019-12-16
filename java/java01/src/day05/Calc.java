package day05;

public class Calc {
	
//	public static int add(int a, int b){
//		return a+b;
//	}
	
//	public static double add(double a, double b){
//		return a+b;
//	}
//	
	public static int add(int ... a){ //가변인자처리 - 배열처리를 해준다.
		int sum=0;
		
		for(int i=0; i<a.length; i++)
			sum +=a[i];
		
		return sum;
	}
	
	
//	
//	
//	public int minus(int a, int b){
//		return a-b;
//	}public int mul(int a, int b){
//		return a*b;
//	}public int div(int a, int b){
//		return a/b;
//	}
//	
	
}
