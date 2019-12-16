package Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookMgr {	
	//Book[] bookList = null;
//	int cnt=0;

	Set<Book> bookList = null;
	
//	Iterator<Book> it = null;
	Iterator<Book> it;

	public BookMgr() {	
		bookList= new HashSet<Book>(10);
	}
	
	public BookMgr(int size) {
		bookList= new HashSet<Book>(size);
	}
	
	
	public void addBook(Book book) {
	
		//Book 객체 등록	
		/**배열 자리가 부족하면 null exception error 발생하는 부분**/
		bookList.add(book);
	}
	
	public void printBookList() {
		System.out.println("==============전체 책 목록==============");
		
		it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			
			System.out.println(book);
		}
		
		
	}
	
	public int printTotalPrice() {
		System.out.println("==============전체 책 가격==============");
		int price =0;
		
		it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			price+=book.getPrice();
		}
		
		return price;
	}
	
	//검색기능 추가
	public void selectBook(String bookname) {
		System.out.println("==============검색결과==============");
		
		it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			if(book.getTitle().toUpperCase().contains(bookname.toUpperCase())) {
				System.out.println(book);
			}
		}			
	}		
}
