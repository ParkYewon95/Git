package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import Homework.Book;

public class Test08 {
	public static void main(String[] args) {
		System.out.println("---------------START---------------");
		
		//반납해야 하는 자원을 try( ) 괄호안에서 생성하고 다 쓰면 자동으로 반납한다. 
		try(Scanner sc = new Scanner(new File("bookdata.txt"));) {
			
			StringTokenizer st =null;
			while(sc.hasNextLine()) { 
				st = new StringTokenizer(sc.nextLine()); // 알아서 쪼개준다 

				String title = st.nextToken();
				int price = Integer.parseInt(st.nextToken());
				
				Book book = new Book(title,price);
				System.out.println(book);
				
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("file 확인 해주세요");
			
		}
		
		System.out.println("---------------END---------------");
	}
}
