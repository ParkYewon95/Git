package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test07 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String,String>();
		map.put("java01", "1234");
		map.put("java02", "1111");
		map.put("java03", "2222");
		map.put("java04", "3333");
		map.put("java05", "1236");
		map.put("java06", "4567");
		map.put("java07", "5642");
		map.put("java08", "9999");

//		System.out.println(map);
//		System.out.println(map.get("java01"));
//		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
				
		//map 순회하기
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String id = (String)it.next();
			System.out.println(id+" : "+map.get(id));
		}
		
		System.out.println(!map.containsKey("java0"));
		
		// 로그인 처리
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("ID를 입력하세요");
			String id = scn.nextLine().trim();
			System.out.println("Password를 입력하세요");
			String pw = scn.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("id x");
				continue;
			}else {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");				
				}
			}
			
		}
		
	}
}
