package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {
		
		//object배열
		//List list1 = new ArrayList();
				
		//String배열
		//List<String> list= new ArrayList<String>();
		
		List<String> list= new Vector<String>();
		
		System.out.println(list.size());
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동");
		list.add("최길동");
		list.add("이길동");
		list.add("홍길동");
		list.add("고길동");
		
		System.out.println(list);
		
		list.remove(2);
		
		//for 루프 기반 순회 사용 방법
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.size());
		System.out.println(list.contains("김길동"));	
		
		System.out.println("============================================");
		
		//iterator 기반 순회 사용 방법
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		System.out.println(" ============= iterator의 소모성 ====================");
		
		//iterator 기반 삭제방법 -> iterator는 소모성이라 한번 사용하고 다시 선언해주지 않으면 안나온다;;
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(" ============= iterator 기반 삭제 ====================");
		String rname = JOptionPane.showInputDialog("삭제할 이름을 입력하세요");
		it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			if(rname.equals(data)) {
				it.remove();
			}
		}
		System.out.println(list);
				
	}

}
