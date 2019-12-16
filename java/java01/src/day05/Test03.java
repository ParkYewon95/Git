package day05;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
		int[] num = new int[] {97,7,1,2,3};
		int [] num2 = num; //num의 주소를 num2에도 링킹.
		int[] num3 = num.clone();	
		
		num2[2] = 99;
		
		Arrays.sort(num3);
		Arrays.sort(num);
		
//		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(num2));
//		System.out.println(Arrays.toString(num3));
//		
		String url = "http://myweb/admin/login.do";
		
		System.out.println(url.indexOf(':'));
		System.out.println(url.indexOf('/'));
		System.out.println(url.lastIndexOf('/'));
//		System.out.println(url.substring(0));
//		System.out.println(url.substring(0,4 ));
//		System.out.println(url.substring(7, 12));
//		System.out.println(url.substring(13, 18));
//		System.out.println(url.substring(19, 27));
		
		
	}

}
