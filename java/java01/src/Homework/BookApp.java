package Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book a1 = new Book("Java Program",1000);
		Book a2 = new Book("JSP Program",2000);
		Book a3 = new Book("SQL Fundamentals",4000);		
		Book a4 = new Book("JDBC Program",5000);
		Book a5 = new Book("EJB Program",7000);
		
		BookMgr bm = new BookMgr(/*size*/); 
		bm.addBook(a1);
		bm.addBook(a2);
		bm.addBook(a3);
		bm.addBook(a4);
		bm.addBook(a5);
		
		bm.addBook(new Book("sql language",5000));
		
		bm.printBookList();
		System.out.println(bm.printTotalPrice());
		
		String bookname = JOptionPane.showInputDialog("검색할 책 제목을 입력하세요");
		bm.selectBook(bookname);
		
		
	}

}
