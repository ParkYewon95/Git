package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test06 {

	public static void main(String[] args) {
			
		Set<Book> bookList = new HashSet<Book>();
		
		//등록 
		bookList.add(new Book("Java의 정석",500));
		bookList.add(new Book("Sql",500));
		bookList.add(new Book("jsp",500));
		bookList.add(new Book("sql 심화",1500));
		bookList.add(new Book("python",3500));
		bookList.add(new Book("ruby",5500));
		bookList.add(new Book("스프링",1200));
		bookList.add(new Book("하둡",7000));
		
		Iterator<Book> it = bookList.iterator();
		
		System.out.println("---------------------책 리스트-----------------------------");
		//출력  
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book);
		}
		
		System.out.println("-----------------------검색------------------------------");
		//검색
		String keyword = JOptionPane.showInputDialog("도서명을 검색하세요");
		it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			
			if(book.title.toUpperCase().contains(keyword.toUpperCase())) {
				System.out.println(book);
			}	
		}
		
		System.out.println("-----------------------삭제------------------------------");
		
		//삭제
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 도서이름을 입력하세요.");
		
		String msg = scanner.nextLine().trim();
		it = bookList.iterator();
		
		while(it.hasNext()) {
			Book book = (Book)it.next();
			
			if(book.title.toUpperCase().contains(msg.toUpperCase())) {
				System.out.println(book);
				System.out.println("삭제할까요? y/n");
				String m = scanner.nextLine().trim();
				if(m.equalsIgnoreCase("y")) { // 대소문자를 구분하지 않고.
					it.remove();
				}
			}	
		}
		
		System.out.println("-----------------------수정------------------------------");
		System.out.println("수정할 도서이름을 입력하세요.");
		msg = scanner.nextLine().trim();
		it=bookList.iterator();
		
		while(it.hasNext()) {
			Book book = (Book)it.next();
			
			if(book.title.contains(msg)) {
				book.title = book.title+"__";
			}
		}
		
		System.out.println("---------------------책 리스트-----------------------------");
		//출력  
		it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book);
		}
		
		
		scanner.close();
		scanner = null;

			
		
	}
}

class Book{
	String title;
	int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
}
