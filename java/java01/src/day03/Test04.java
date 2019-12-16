package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("app start");
		
		int kor=0, eng=0, math=0;
		Scanner scn = new Scanner(new FileInputStream("c://lib/score.txt"));
			
		System.out.println("학생이름 국어 영어 수학 점수를 입력하세요");
		
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
			
			if(avg>=90) {
				grade = 'A';
			}else if(avg>=80) {
				grade = 'B';
			}else if(avg>=70) {
				grade = 'C';
			}else if(avg>=60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.printf(" 학점 = %c %n",grade);
		}
		if(scn!=null)		
			scn.close();
		scn = null;
		
		return;
	}

}
