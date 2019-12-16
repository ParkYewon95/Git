package Homework;

import java.util.Arrays;

public class Prob3 {
	public static void main(String[] args) {
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		String[] reverse = new String[strData.length];
		
		for(int i=0; i<strData.length; i++) {
			
			reverse[i] = strData[strData.length-i-1];		
				
			String a = "";
			
			//System.out.println("reverse index :"+i + "번째 길이 "+reverse[i].length());
			for(int j=0; j<reverse[i].length(); j++) {
				//System.out.print(j);
				a+=reverse[i].charAt(reverse[i].length()-j-1);
			}
			//System.out.println(a);
			
			reverse[i]=a;
			
		}
		
		System.out.println(Arrays.toString(reverse));
		
	}
}

