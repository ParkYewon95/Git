package day02;
import java.util.Date;
//import java.sql.Date;


public class Test02 {

	public static void main(String[] args) {
		
		
		String msg = "hello java~";
		
		int size = msg.length();
		
		System.out.println(msg.toUpperCase());
		System.out.println((int)'A'+" "+ (int)'a');

		System.out.println(size);
		//java.sql.Date date2;
		
		Date date = new Date();
		System.out.println(date.toLocaleString());
				
		
	}
}
