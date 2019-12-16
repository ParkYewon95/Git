package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("app start");
		
		int kor=0, eng=0, math=0;
		Scanner scn = new Scanner(new FileInputStream("c://lib/score.txt"),"utf-8");
			
		
		for (int i=0; i<7;i++) {
			String name = scn.next();
			kor = scn.nextInt();
			eng = scn.nextInt();
			math = scn.nextInt();
			scn.nextLine(); // nextint로 들어온 보여진 값 이외에 모두 소진시킴. 
			
			
			double sum= kor+eng+math;
			double avg = sum/3;
		
			System.out
			.printf("이름 : %s : 국어 = %d, 영어 = %d, 수학 = %d ",name,kor,eng,math);
			System.out.printf("평균 = %.2f ",avg);
	
			// 학점 처리. A B C D F
			char grade = 'F';
			
			switch((int)avg/10) {
				
			case 10 :
				
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade='F';
				break;
			
			}
			
//			if(avg>=90) {
//				grade = 'A';
//			}else if(avg>=80) {
//				grade = 'B';
//			}else if(avg>=70) {
//				grade = 'C';
//			}else if(avg>=60) {
//				grade = 'D';
//			}else {
//				grade = 'F';
//			}
			
	
			
			System.out.printf(" 학점 = %c %n",grade);
			
			switch(grade) {
			
			case 'A' :
				System.out.println("학점 A 축하드립니다");
				break;
			case 'B' :
				System.out.println("학점 B 축하드립니다");
				break;
			case 'C' :
				System.out.println("학점 C 분발하세요");
				break;
			case 'D' :
				System.out.println("학점 D 분발하세요");
				break;
			case 'F' :
				System.out.println("학점 F 재수강하세요");
				break;
					
			
			}
		}
		if(scn!=null)		
			scn.close();
		scn = null;
		
		return;
	}

}
