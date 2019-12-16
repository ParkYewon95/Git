package day03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		String name=null;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		name = scn.nextLine();
		
		int kor =0;
		System.out.println("국어성적을 입력하세요 : ");
		kor = scn.nextInt();
		
		int math =0;
		System.out.println("수학성적을 입력하세요 : ");
		math = scn.nextInt();
		scn.nextLine();
		System.out.printf("이름 : %s , 국어점수 : %d, 수학점수 : %d %n",name,kor,math);
		System.out.printf("kor: %d , math : %d , 결과 : %s",kor,math,(kor+math)/2>=80?"합격":"불합격");
		
		scn.close();
		scn = null;
	}
}
