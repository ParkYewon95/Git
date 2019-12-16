package App;

import java.util.Scanner;

public class MyApp {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean flag = true;
		String cmd = null;
		
		while(flag) {
			
			System.out.println("원하는 메뉴 번호를 입력하세요");
			System.out.printf("%n 1. 입  력 %n 2. 수  정%n 3. 삭  제 %n 4. 검  색 %n 5. 목록보기 %n 9. 종  료  %n%n");
			
			cmd = scn.nextLine().trim(); // 혹시 모를 공백에 대비해서
//			int menu_num = scn.nextInt();
			
			switch(cmd) {
			
			case "1" : 
				System.out.println("=============입력 선택=============");
				break;
			case "2" :
				System.out.println("=============수정 선택=============");
				break;
			case "3" :
				System.out.println("=============삭제 선택=============");
				break;
			case "4" :
				System.out.println("=============검색 선택=============");
				break;
			case "5" :
				System.out.println("=============목록보기 선택=============");
				break;
			case "9" : 
				System.out.println("=============종료 선택=============");
				
				System.out.println("정말로 종료하시겠습니까? (y/n)");
				String a= scn.next();
				
				if(a.equalsIgnoreCase("q")) {
					System.out.println("app이 종료되었습니다");
					scn.close();
					scn = null;
					flag=false;
					break;
				}
				
			default : 
				System.out.println("===========다시 선택=============");
				break;
			
			}
		
		}
	}


}
