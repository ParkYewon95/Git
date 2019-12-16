package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import Homework.Book;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("---------------START---------------");
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("bookdata.txt"));
			while(sc.hasNextLine()) { //다음줄이 있을때까지수행
				// 공백을 기준으로 쪼개짐. -> 쪼갠 데이터는 string[]로 생성
				String[] data = sc.nextLine().split(" "); 
				Book book = new Book(data[0],Integer.parseInt(data[1]));
				System.out.println(book);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("file 확인 해주세요");
			
		}finally {
			//try에서 에러가 발생하면 sc = null 인상태이고 
			//주소가 할당되지 않았는데 close()를 쓰는 건 잘못된 코드이다.
			// 주소가 할당되었는지 확인해준다.
			if(sc != null)
				sc.close();
		}
		
		System.out.println("---------------END---------------");
	}
}
