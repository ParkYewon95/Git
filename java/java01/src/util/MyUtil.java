package util;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyUtil {
	public static int[] sort(int[] a) { // 주소가 들어옴 . a를 바꾸면 원본이 바뀜.
		int[] num = a.clone();
		for(int i=0; i<num.length-1; i++) {
			int min=i;
			for(int j=i+1; j<num.length; j++) {
				if(num[min]>num[j]) {
					min = j;
				}
				
			}
			if(i!=min) {
				swap(num,i,min);
			}
			
		}
		return num;
		
	}
	
	//i min 위치 값 변경
	public static void swap(int[] num,int i, int min) {
		
		int temp = num[i];
		num[i]=num[min];
		num[min]=temp;
		
	}
	//두개의 정수를 입력받아 큰 값을 리턴하는 함수 
	
	public static int max(int a, int b) {
			
		return a>=b ? a:b;
	
	}
	
	public static void iteratorPrint(Set<String> list) {
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		
	}
	public static void iteratorPrint(List<String> list) {
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		
	}
	
	
}
